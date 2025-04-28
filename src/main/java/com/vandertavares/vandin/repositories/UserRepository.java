package com.vandertavares.vandin.repositories;

import com.vandertavares.vandin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
