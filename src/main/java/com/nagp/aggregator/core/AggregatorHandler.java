package com.nagp.aggregator.core;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagp.aggregator.entities.Order;
import com.nagp.aggregator.entities.OrderDetails;
import com.nagp.aggregator.entities.User;

@Service
public class AggregatorHandler {

	@Resource(name = "restTemp")
	private RestTemplate restTemplate;

	@Value("${user.home.url}")
	private String userHomeUrl;

	@Value("${order.home.url}")
	private String orderHomeUrl;

	public OrderDetails getOrderDetails(String userId) {
		User user = restTemplate.getForObject(userHomeUrl + userId, User.class);
		List<Order> orders = restTemplate.getForObject(orderHomeUrl + userId, List.class);
		return new OrderDetails(user, orders);
	}

}
