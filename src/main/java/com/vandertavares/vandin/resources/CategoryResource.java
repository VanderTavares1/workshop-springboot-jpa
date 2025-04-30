package com.vandertavares.vandin.resources;

import java.util.List;

import com.vandertavares.vandin.entities.CategoryEntity;
import com.vandertavares.vandin.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryEntity>> findAll() {
        List<CategoryEntity> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<CategoryEntity> findById(@PathVariable Long id) {
        CategoryEntity obj = categoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}