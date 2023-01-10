package com.leonardooliveira.courseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardooliveira.courseproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
