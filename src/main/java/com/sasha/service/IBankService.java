package com.sasha.service;

import java.util.List;

import com.sasha.model.Bank;

public interface IBankService {
	
	public Long saveBank(Bank bank);
	public List<Bank> getAllBank();
	public void updateBank(Bank bank);
	public void deleteBank(Integer id);
	public Bank getOneBank(Integer id);
}
