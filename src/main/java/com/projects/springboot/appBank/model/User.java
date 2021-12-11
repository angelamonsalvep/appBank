package com.projects.springboot.appBank.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {
	
	@org.springframework.data.annotation.Id
	private String Id;
	
	private String names;
	private String email;
	private String pass;
	private String numberAccount;
	private long balance;
	
	public User() {
		super();
	}

	public User(String id, String names, String email, String pass, String numberAccount, long balance) {
		super();
		Id = id;
		this.names = names;
		this.email = email;
		this.pass = pass;
		this.numberAccount = numberAccount;
		this.balance = balance;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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
	
	
	
	

}
