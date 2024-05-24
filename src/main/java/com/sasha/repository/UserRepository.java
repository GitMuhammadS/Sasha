package com.sasha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasha.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
