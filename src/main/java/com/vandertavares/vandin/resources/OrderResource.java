package com.vandertavares.vandin.resources;

import java.util.List;

import com.vandertavares.vandin.entities.OrderEntity;
import com.vandertavares.vandin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderEntity>> findAll() {
        List<OrderEntity> list = orderService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<OrderEntity> findById(@PathVariable Long id) {
        OrderEntity obj = orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}