package com.projects.springboot.appBank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Withdrawal {
	
	@Id
	private long id;
	
	private String date;
	private String hour;
	private long amount;
	private long autorizationCode;
	
	public Withdrawal() {
		super();
	}

	public Withdrawal(long id, String date, String hour, long amount, long autorizationCode) {
		super();
		this.id = id;
		this.date = date;
		this.hour = hour;
		this.amount = amount;
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

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getAutorizationCode() {
		return autorizationCode;
	}

	public void setAutorizationCode(long autorizationCode) {
		this.autorizationCode = autorizationCode;
	}
	
	
	
	
	

}
