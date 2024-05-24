package com.sasha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasha.model.User;
import com.sasha.service.IUserService;

@RestController
@RequestMapping("/sasha")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		try {
			Long l=userService.saveUser(user);
			String resultMsg="You have registered with Sasha with an id "+l;
			return new ResponseEntity<String>(resultMsg,HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<String>("PROBLEM IN SASHA USER ENROLLMENT",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/allUsers")
	public ResponseEntity<?> getAllUser(){
		try {
			System.out.println(userService.getAllUser());
			List<User> list=userService.getAllUser();
			return new ResponseEntity<List<User>>(list,HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("PROBLEM IN FETCHING USERS",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
