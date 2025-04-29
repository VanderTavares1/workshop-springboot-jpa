package com.vandertavares.vandin.resources;

import com.vandertavares.vandin.entities.CategoryEntity;
import com.vandertavares.vandin.entities.ProductEntity;
import com.vandertavares.vandin.service.CategoryService;
import com.vandertavares.vandin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
@RestController
@RequestMapping(value = "/products")
public class ProductResource {

        @Autowired
        private ProductService productService;

        @GetMapping
        public ResponseEntity<List<ProductEntity>> findAll() {
            List<ProductEntity> list = productService.findAll();
            return ResponseEntity.ok().body(list);
        }

        @GetMapping(value = "/id/{id}")
        public ResponseEntity<ProductEntity> findById(@PathVariable Long id) {
            ProductEntity obj = productService.findById(id);
            return ResponseEntity.ok().body(obj);
        }
}
