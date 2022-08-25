package com.hnt.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.hnt.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
	
	@InjectMocks
	UserService user;
	
	@Mock
	UserRepository repository;
	

	@Test
	void testSave() {
		
		fail("Not yet implemented");
	}

}
