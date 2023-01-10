package com.leonardooliveira.courseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardooliveira.courseproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
