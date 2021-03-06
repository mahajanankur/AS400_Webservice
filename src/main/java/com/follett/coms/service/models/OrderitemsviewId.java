package com.follett.coms.service.models;

// Generated 5 Oct, 2015 11:48:28 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderitemsviewId generated by hbm2java
 */
@Embeddable
public class OrderitemsviewId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int orderNumber;

	private String orderSuffix;

	@Column(name = "ORDER_NUMBER", nullable = false, precision = 7, scale = 0)
	public int getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Column(name = "ORDER_SUFFIX", nullable = false, length = 2)
	public String getOrderSuffix() {
		return this.orderSuffix;
	}

	public void setOrderSuffix(String orderSuffix) {
		this.orderSuffix = orderSuffix;
	}
}
