package com.example.SmartContactManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SmartContactManager.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
