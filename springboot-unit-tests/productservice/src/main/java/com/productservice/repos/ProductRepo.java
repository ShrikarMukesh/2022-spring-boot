package com.productservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
