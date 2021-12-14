package com.projects.springboot.appBank.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Document("users")
public class User {
	
	@Id
	private String id;
	
	@Field
	private String names;
	
	@Field
	private String email;
	
	@Field
	private String pass;
	
	@Field
	private String numberAccount;
	
	@Field
	private long balance;
	
	public User() {
	}

	public User(String id, String names, String email, String pass, String numberAccount, long balance) {
		this.id = id;
		this.names = names;
		this.email = email;
		this.pass = pass;
		this.numberAccount = numberAccount;
		this.balance = balance;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", names=" + names + ", email=" + email + ", pass=" + pass + ", numberAccount="
				+ numberAccount + ", balance=" + balance + "]";
	}
	
	
	
	

}
