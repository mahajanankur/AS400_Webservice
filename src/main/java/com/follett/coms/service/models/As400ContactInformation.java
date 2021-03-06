package com.follett.coms.service.models;

// Generated 5 Oct, 2015 11:48:28 AM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * As400ContactInformation generated by hbm2java
 */
@Entity
@Table(name = "AS400_CONTACT_INFORMATION")
public class As400ContactInformation implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private BigDecimal contactId;

	private As400Customers as400Customers;

	private As400BillShipInformation as400BillShipInformation;

	private String contactName;

	private String orderNumber;

	private String orderSuffix;

	public As400ContactInformation() {
	}

	public As400ContactInformation(BigDecimal contactId) {
		this.contactId = contactId;
	}

	public As400ContactInformation(BigDecimal contactId,
			As400Customers as400Customers,
			As400BillShipInformation as400BillShipInformation,
			String contactName, String orderNumber, String orderSuffix) {
		this.contactId = contactId;
		this.as400Customers = as400Customers;
		this.as400BillShipInformation = as400BillShipInformation;
		this.contactName = contactName;
		this.orderNumber = orderNumber;
		this.orderSuffix = orderSuffix;
	}

	@Id
	@Column(name = "CONTACT_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getContactId() {
		return this.contactId;
	}

	public void setContactId(BigDecimal contactId) {
		this.contactId = contactId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_NUMBER")
	public As400Customers getAs400Customers() {
		return this.as400Customers;
	}

	public void setAs400Customers(As400Customers as400Customers) {
		this.as400Customers = as400Customers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BILL_SHIP_ID")
	public As400BillShipInformation getAs400BillShipInformation() {
		return this.as400BillShipInformation;
	}

	public void setAs400BillShipInformation(
			As400BillShipInformation as400BillShipInformation) {
		this.as400BillShipInformation = as400BillShipInformation;
	}

	@Column(name = "CONTACT_NAME", length = 30)
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name = "ORDER_NUMBER", length = 30)
	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Column(name = "ORDER_SUFFIX", length = 2)
	public String getOrderSuffix() {
		return this.orderSuffix;
	}

	public void setOrderSuffix(String orderSuffix) {
		this.orderSuffix = orderSuffix;
	}

}
