package com.guava.api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="account_number", nullable=false, length=20)
	private String accountNumber;
	@Column(name="account_name", nullable=false, length=100)
	private String accountName;
	@Column(name="address", nullable=false, length=250)
	private String address;
	@Column(name="ssn", nullable=false, length=16)
	private String ssn;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
	private List<Policy> policies;

	public Account(){}

	public Account(String accountNumber, String accountName, String address, String ssn){
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.address = address;
		this.ssn = ssn;
	}

	public List<Policy> getPolicies(){
		return policies;
	}

	public void setPolicies(List<Policy> policies){
		this.policies = policies;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}