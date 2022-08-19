package com.store.controller;

import com.store.model.Products;
import com.store.service.ProductsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
@RequiredArgsConstructor
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping("/list")
    public List<Products> productsList(){
        return productsService.productsList();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Products saveProduct(@RequestBody Products products){
        return  productsService.saveProduct(products);

    }
}
