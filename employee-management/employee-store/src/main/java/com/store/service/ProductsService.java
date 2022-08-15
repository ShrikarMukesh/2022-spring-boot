package com.store.service;

import com.store.model.Products;
import com.store.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    public ProductsRepository productsRepository;

    public List<Products> productsList(){
        return  productsRepository.findAll();
    }
}
