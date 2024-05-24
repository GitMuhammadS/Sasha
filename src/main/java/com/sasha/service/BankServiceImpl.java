package com.sasha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasha.model.Bank;
import com.sasha.repository.BankRepository;

@Service
public class BankServiceImpl implements IBankService{
	@Autowired
	private BankRepository bankRepo;
	
	@Override
	public Long saveBank(Bank bank) {
		// TODO Auto-generated method stub
		return bankRepo.save(bank).getId();
	}

	@Override
	public List<Bank> getAllBank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBank(Bank bank) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBank(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bank getOneBank(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
