package com.vandertavares.vandin.repositories;

import com.vandertavares.vandin.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}