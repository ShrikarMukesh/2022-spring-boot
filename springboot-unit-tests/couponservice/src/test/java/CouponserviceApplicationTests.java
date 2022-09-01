import com.couponsservice.controllers.CouponRestController;
import com.couponsservice.model.Coupon;
import com.couponsservice.repos.CouponRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = CouponserviceApplicationTests.class)
class CouponserviceApplicationTests {

    private static final String FLASHSALE = "FLASHSALE";

    @Mock
    private CouponRepo couponRepo;

    @InjectMocks
    CouponRestController couponRestController;

    @Test
    void testCreate(){
        Coupon coupon = new Coupon();
        coupon.setCode(FLASHSALE);
        when(couponRepo.save(coupon)).thenReturn(coupon);
        Coupon couponCreated = couponRestController.create(coupon);
        verify(couponRepo).save(coupon);
        assertNotNull(couponCreated);
        assertEquals("FLASHSALE", coupon.getCode());
    }

    @Test
    void getCouponTest(){
        Coupon coupon = new Coupon();
        coupon.setCode(FLASHSALE);
        coupon.setDiscount(new BigDecimal(10));
        when(couponRepo.findByCode(FLASHSALE)).thenReturn(coupon);
        Coupon couponResponse = couponRestController.getCoupon(FLASHSALE);
        assertNotNull(couponResponse);
        assertEquals(new BigDecimal(10), couponResponse.getDiscount());
    }
    @Test
    void throw_Exception_When_COUPON_IS_NULL(){
        assertThrows(IllegalArgumentException.class , ()->{
            couponRestController.create(null);
        });

    }
}
