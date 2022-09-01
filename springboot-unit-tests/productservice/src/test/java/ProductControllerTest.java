import com.productservice.controllers.ProductRestController;
import com.productservice.dto.Coupon;
import com.productservice.model.Product;
import com.productservice.repos.ProductRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = ProductControllerTest.class)
public class ProductControllerTest {

    private static final String FLASHSALE = "FLASHSALE";
    private static final String couponServeURI = "http://localhost:9091/couponapi/coupons";
    @Mock
    ProductRepo productRepo;

    @InjectMocks
    ProductRestController productController;

    @Mock
    RestTemplate restTemplate;

    @Test
    void createProduct_Testcase(){
        Coupon coupon = new Coupon();
        coupon.setCode(FLASHSALE);
        coupon.setDiscount(new BigDecimal(10));

        Product product = new Product();
        product.setPrice(new BigDecimal(1000));
        product.setCouponCode(FLASHSALE);

        productController.setCouponServiceURL(couponServeURI);
        when(restTemplate.getForObject(couponServeURI + FLASHSALE, Coupon.class)).thenReturn(coupon);
        when(productRepo.save(product)).thenReturn(product);

        Product createdProduct = productController.create(product);
        verify(restTemplate).getForObject(couponServeURI + FLASHSALE , Coupon.class);
        verify(productRepo).save(product);
        assertNotNull(createdProduct);
        assertEquals(FLASHSALE, createdProduct.getCouponCode());

        
    }


}
