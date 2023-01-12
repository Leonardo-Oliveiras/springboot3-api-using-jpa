package com.leonardooliveira.courseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardooliveira.courseproject.entities.OrderItem;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long>{

}
