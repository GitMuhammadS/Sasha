package com.sasha.service;

import java.util.List;

import com.sasha.model.User;

public interface IUserService {
	
	public Long saveUser(User sasha);
	public List<User> getAllUser();
	public void updateUser(User user);
	public void deleteUser(Integer id);
	public User getOneUser(Integer id);
	
}
