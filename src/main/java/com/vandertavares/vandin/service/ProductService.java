package com.vandertavares.vandin.service;

import java.util.List;
import java.util.Optional;

import com.vandertavares.vandin.entities.ProductEntity;
import com.vandertavares.vandin.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<ProductEntity> findAll() {
        return repository.findAll();
    }

    public ProductEntity findById(Long id) {
        Optional<ProductEntity> obj = repository.findById(id);
        return obj.get();
    }
}