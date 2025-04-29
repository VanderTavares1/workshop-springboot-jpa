package com.vandertavares.vandin.repositories;

import com.vandertavares.vandin.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}
