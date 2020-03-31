package com.nagp.aggregator.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.lang.NonNull;

public class OrderDetails {

	private User userDetails;
	private List<Order> orders;

	public OrderDetails(@NonNull User userDetails, @NonNull List<Order> orders) {
		this.userDetails = userDetails;
		this.orders = orders;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public List<Order> getOrders() {
		return Collections.unmodifiableList(orders);
	}

}
