package com.vandertavares.vandin.service;

import java.util.List;
import java.util.Optional;

import com.vandertavares.vandin.entities.OrderEntity;
import com.vandertavares.vandin.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<OrderEntity> findAll() {
        return repository.findAll();
    }

    public OrderEntity findById(Long id) {
        Optional<OrderEntity> obj = repository.findById(id);
        return obj.get();
    }
}