package com.vandertavares.vandin.repositories;

import com.vandertavares.vandin.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}