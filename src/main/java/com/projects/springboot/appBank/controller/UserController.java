package com.projects.springboot.appBank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.springboot.appBank.model.User;
import com.projects.springboot.appBank.service.UserService;

@RestController
@RequestMapping("/user/api/v1")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/all")
	public List<User> getAll() {
		return userService.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public User find(@PathVariable String id) {
		return userService.get(id);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<User> save(@RequestBody User user) {
		User obj = userService.save(user);
		return new ResponseEntity<User>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<User> delete(@PathVariable String id) {
		User user = userService.get(id);
		if(user != null) {
			userService.delete(id);
		} else {
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	
}


