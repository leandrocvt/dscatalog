package com.devsuperior.dscatalog.factory;

import com.devsuperior.dscatalog.lib.dto.ProductDTO;
import com.devsuperior.dscatalog.lib.entities.Category;
import com.devsuperior.dscatalog.lib.entities.Product;

import java.time.Instant;

public class ProductFactory {

    public static Product createProduct(){
        Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2025-01-14T03:00:00Z"));
        product.getCategories().add(createCategory());
        return product;
    }

    public static ProductDTO createProductDTO(){
        Product product = createProduct();
        return new ProductDTO(product, product.getCategories());
    }

    public static Category createCategory(){
        return new Category(1L, "Electronics");
    }

}
