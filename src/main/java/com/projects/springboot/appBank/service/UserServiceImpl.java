package com.projects.springboot.appBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.projects.springboot.appBank.commons.GenericServiceImpl;
import com.projects.springboot.appBank.model.User;
import com.projects.springboot.appBank.repository.UserRepository;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, String> implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public CrudRepository<User, String> getDao() {
		return userRepository;
	}

}
