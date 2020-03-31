package com.nagp.aggregator.entities;

import java.util.Date;

import org.springframework.lang.NonNull;

public class Order {

	private String orderId;
	private Double orderAmount;
	private Date orderDate;

	public Order() {
	}

	public Order(@NonNull final String orderId, @NonNull final Double orderAmount, @NonNull final Date orderDate) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

}
