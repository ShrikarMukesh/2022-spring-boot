package com.store.service;

import com.store.model.Orders;
import com.store.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    public OrdersRepository ordersRepository;

    public List<Orders> ordersList(){
        return  ordersRepository.findAll();
    }

}
