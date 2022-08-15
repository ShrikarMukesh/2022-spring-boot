package com.store.controller;

import com.store.model.Orders;
import com.store.model.Products;
import com.store.service.OrdersService;
import com.store.service.ProductsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@Slf4j
@RequiredArgsConstructor
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping("/list")
    public List<Orders> ordersList(){
        return ordersService.ordersList();
    }
}
