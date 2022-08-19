package com.store.repository;

import com.store.AbstractContainerBaseTest;
import com.store.model.Products;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductsRepositoryTest  extends AbstractContainerBaseTest {

    @Autowired
    private ProductsRepository productsRepository;

    // JUnit for save student operation - BDD style
    @Test
    public void givenStudentObject_whenSave_thenReturnSavedStudent(){

        // given - setup or precondition
        Products student = Products.builder()
                .productId(1)
                .name("Foam Dinner Plate")
                .quantityInStock(70)
                .unitPrice(1.21f)
                .build();

        // when - action or the testing
        Products productSaved = productsRepository.save(student);

        // then - very output
        Assertions.assertNotNull(productSaved);

    }

     //JUnit for save student operation - BDD style
    @Test
    public void givenStudentId_whenfindbyId_thenReturnSavedStudent(){

        // given - setup or precondition
        Products product = Products.builder()
                .productId(1)
                .name("Foam Dinner Plate")
                .quantityInStock(70)
                .unitPrice(1.21f)
                .build();
        Products savedStudent = productsRepository.save(product);

        // when - action or the testing
        Optional<Products> productDB = productsRepository.findById(product.getProductId());

        // then - very output
        Assertions.assertNotNull(productDB.isPresent());
    }
}
