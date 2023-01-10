package com.leonardooliveira.courseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardooliveira.courseproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
