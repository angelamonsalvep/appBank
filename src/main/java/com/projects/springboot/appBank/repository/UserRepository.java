package com.projects.springboot.appBank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projects.springboot.appBank.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	

}
