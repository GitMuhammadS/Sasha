package com.sasha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasha.model.User;
import com.sasha.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public Long saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user).getId();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
