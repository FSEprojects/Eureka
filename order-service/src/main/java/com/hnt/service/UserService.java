package com.hnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.UserRepository;
import com.hnt.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	
	public void save(User user) {
		if(user.getName().equals("Akhil"))
			throw new IllegalArgumentException("message");
		else
			
			repository.save(user);
		
	}
	
	public Iterable<User> getUser(){
		return repository.findAll();
	}

}
