package com.nagp.aggregator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.aggregator.core.AggregatorHandler;
import com.nagp.aggregator.entities.OrderDetails;

@RestController
@RequestMapping(value = "/orderdetails")
public class AggregatorController {

	@Autowired
	AggregatorHandler aggregatorHandler;

	private static final Logger LOGGER = LoggerFactory.getLogger(AggregatorController.class);

	@GetMapping(value = "/{userId}")
	OrderDetails getOrderDetailsByUserId(@PathVariable(name = "userId") String userId) {
		return aggregatorHandler.getOrderDetails(userId);
	}

}
