package com.sasha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasha.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>{

}
