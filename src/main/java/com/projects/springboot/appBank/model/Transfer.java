package com.projects.springboot.appBank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transfer {
	
	@Id
	private long id;
	
	private String date;
	private String hour;
	private String amount;
	private String destinationAccount;
	private long autorizationCode;
	
	public Transfer() {
		super();
	}

	public Transfer(long id, String date, String hour, String amount, String destinationAccount,
			long autorizationCode) {
		super();
		this.id = id;
		this.date = date;
		this.hour = hour;
		this.amount = amount;
		this.destinationAccount = destinationAccount;
		this.autorizationCode = autorizationCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDestinationAccount() {
		return destinationAccount;
	}

	public void setDestinationAccount(String destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

	public long getAutorizationCode() {
		return autorizationCode;
	}

	public void setAutorizationCode(long autorizationCode) {
		this.autorizationCode = autorizationCode;
	}
	
	
	
	
	
	

}
