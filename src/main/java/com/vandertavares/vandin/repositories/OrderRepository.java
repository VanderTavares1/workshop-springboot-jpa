package com.vandertavares.vandin.repositories;

import com.vandertavares.vandin.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}