package com.vandertavares.vandin.service;

import java.util.List;
import java.util.Optional;

import com.vandertavares.vandin.entities.CategoryEntity;
import com.vandertavares.vandin.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<CategoryEntity> findAll() {
        return repository.findAll();
    }

    public CategoryEntity findById(Long id) {
        Optional<CategoryEntity> obj = repository.findById(id);
        return obj.get();
    }
}