package com.bsSystem;

import java.sql.Date;
import java.time.LocalDate;
public class Customer {
	long account_number;
	String full_name;
	String email;
	double balance;
	Date sqlDate;

    public Customer(long account_number, String full_name, String email, double balance, Date sqldate) {
		super();
		this.account_number = account_number;
		this.full_name = full_name;
		this.email = email;
		this.balance = balance;
		this.sqlDate = sqldate;
	}	
	public Date getSqlDate() {
		return sqlDate;
	}

	public long getAccount_number() {
		return account_number;
	}
	public String getFull_name() {
		return full_name;
	}
	public String getEmail() {
		return email;
	}
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		
		return "Date of Login: "+ sqlDate +"\n Account Number : "+ account_number +"\nFull Name "+ full_name +"\nE-mail "+ email +"\nBalance "+ balance+"\n" ;
		
	}
	
	
	
	

}
