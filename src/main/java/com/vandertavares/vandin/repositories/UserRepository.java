package com.vandertavares.vandin.repositories;

import com.vandertavares.vandin.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
