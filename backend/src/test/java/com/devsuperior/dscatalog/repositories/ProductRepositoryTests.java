package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.factory.ProductFactory;
import com.devsuperior.dscatalog.lib.entities.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class ProductRepositoryTests {

    @Autowired
    private ProductRepository repository;

    private long exitingId;
    private long countTotalProducts;
    private long nonExistingId;

    @BeforeEach
    void setup() throws Exception{
        exitingId = 1L;
        countTotalProducts = 25L;
        nonExistingId = 100L;
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull(){

        Product product = ProductFactory.createProduct();
        product.setId(null);

        product = repository.save(product);

        Assertions.assertNotNull(product.getId());
        Assertions.assertEquals(countTotalProducts + 1, product.getId());
    }

    @Test
    public void findByIdShouldReturnNunEmptyOptionalWhenIdExists(){

        Optional<Product> product = repository.findById(exitingId);

        Assertions.assertTrue(product.isPresent());
    }

    @Test
    public void findByIdShouldReturnEmptyOptionalWhenIdNotExists(){

        Optional<Product> product = repository.findById(nonExistingId);

        Assertions.assertTrue(product.isEmpty());
    }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists(){

        repository.deleteById(exitingId);

        Optional<Product> result = repository.findById(exitingId);
        Assertions.assertFalse(result.isPresent());
    }

}
