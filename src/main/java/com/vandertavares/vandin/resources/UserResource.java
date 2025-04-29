package com.vandertavares.vandin.resources;

import com.vandertavares.vandin.entities.UserEntity;
import com.vandertavares.vandin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserEntity>> findAll() {
        List<UserEntity> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<UserEntity> findById(@PathVariable Long id){
        UserEntity obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/nome/{name}")
    public ResponseEntity<UserEntity> buscandoNome(@PathVariable String name){
        UserEntity obj = service.buscandoNome(name);
        return ResponseEntity.ok().body(obj);
    }
}