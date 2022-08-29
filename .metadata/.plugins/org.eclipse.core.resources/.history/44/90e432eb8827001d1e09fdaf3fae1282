package com.hnt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hnt.entity.User;
import com.hnt.service.UserService;
import com.sun.net.httpserver.Headers;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping
	Iterable<User> getUser() {
		return userService.getUser();
	}
	
	@PostMapping("/user/age/{age}/height/{height}")
	ResponseEntity saveUser(@Valid @RequestBody User user, @PathVariable("age") int age, @PathVariable("height") float height) {
		userService.save(user);
		System.out.println(height);
		System.out.println(age);
		
		MultiValueMap headers = new LinkedMultiValueMap<String, String>();
		headers.add("headersfromserver", "success");
		ResponseEntity responseEntity = new ResponseEntity<>(headers, HttpStatus.CREATED);
		return responseEntity;
	}
	@PostMapping("/user")
	void saveUser1(@RequestBody User user) {
		userService.save(user);
		System.out.println("second");
	}
	
	
	//return responseEntity;
	
@ExceptionHandler(MethodArgumentNotValidException.class)	
	Map<String, String> handleException(MethodArgumentNotValidException ex) {
		Map<String , String> errors = new HashMap();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldname = ((FieldError)error).getField();
			String message = ((FieldError) error).getDefaultMessage();
			errors.put(fieldname, message);
		});
		return errors;

	}
}
