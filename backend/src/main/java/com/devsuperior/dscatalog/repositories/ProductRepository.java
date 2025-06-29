package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.lib.entities.Category;
import com.devsuperior.dscatalog.lib.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
