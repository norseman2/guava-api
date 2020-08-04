package com.guava.api.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long policyid;
	@Column(name="product", nullable=false, length=50)
	private String product;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="account")
	private Account account;
	@Column(name="offering", nullable=false, length=50)
	private String offering;
	@Column(name="number", nullable=false, length=25)
	private String number;
	@Column(name="effective_date", nullable=false)
	private java.sql.Timestamp effectiveDate;
	@Column(name="expiration_date", nullable=false)
	private java.sql.Timestamp expirationDate;
	@Column(name="total_premium", nullable=false)
	private double totalPremium;
	@Column(name="taxes_and_fees", nullable=false)
	private double taxesAndFees;
	@Column(name="total_cost", nullable=false)
	private double totalCost;
	@Column(name="producer", nullable=false, length=50)
	private String producer;	



	public Policy() {
	}

	public Policy(String product, String offering, String number, java.sql.Timestamp effectiveDate, java.sql.Timestamp expirationDate,
	double totalPremium, double taxesAndFees, double totalCost, String producer, Account account) {
		super();
		this.product = product;
		this.offering = offering;
		this.number = number;
		this.effectiveDate = effectiveDate;
		this.expirationDate = expirationDate;
		this.totalPremium = totalPremium;
		this.taxesAndFees = taxesAndFees;
		this.totalCost = totalCost;
		this.producer = producer;
		this.account = account;
	}

	public Account getAccount(){
		return account;
	}

	public void setAccount(Account account){
		this.account = account;
	}

	public long getPolicyid() {
		return this.policyid;
	}

	public void setPolicyid(long policyid) {
		this.policyid = policyid;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getOffering() {
		return this.offering;
	}

	public void setOffering(String offering) {
		this.offering = offering;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public java.sql.Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(java.sql.Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public java.sql.Timestamp getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(java.sql.Timestamp expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getTotalPremium() {
		return this.totalPremium;
	}

	public void setTotalPremium(double totalPremium) {
		this.totalPremium = totalPremium;
	}

	public double getTaxesAndFees() {
		return this.taxesAndFees;
	}

	public void setTaxesAndFees(double taxesAndFees) {
		this.taxesAndFees = taxesAndFees;
	}

	public double getTotalCost() {
		return this.totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getProducer() {
		return this.producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

}