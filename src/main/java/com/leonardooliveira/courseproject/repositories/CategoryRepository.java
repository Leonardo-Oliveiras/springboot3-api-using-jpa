package com.leonardooliveira.courseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardooliveira.courseproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
