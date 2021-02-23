package com.qa.ims.controller;



import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	//OrderController.java
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private Utils utils;
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}
	// view all the orders
	@Override
	public List<Order> readAll(){
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders)
			LOGGER.info(order);
		return orders;
	}

	//Creates an order by taking user input 
	@Override
	public Order create() {
		LOGGER.info("Please enter an Order ID ");
		Long orderID = utils.getLong();
		LOGGER.info("Please enter a item ID");
		Long itemID = utils.getLong();
		LOGGER.info("Please enter a customer ID");
		Long customerID = utils.getLong();
		LOGGER.info("please enter a quantity");
		Long quantity = utils.getLong();
		Order order = orderDAO.create(new Order(orderID, customerID, itemID, quantity));
		LOGGER.info("Customer created");
		return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Please entere the order ID you would like to update");
		Long orderID = utils.getLong();
		LOGGER.info("Please entere the customer ID you would like to update");
		Long customerID = utils.getLong();
		LOGGER.info("Please entere the item ID you would like to update");
		Long itemID = utils.getLong();
		LOGGER.info("Please entere the quantity you would like to update");
		Long quantity = utils.getLong();
		
		Order order = orderDAO.update(new Order(orderID, customerID, itemID, quantity));
		LOGGER.info("Orders Updated");
		return order;
	}
	
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long orderID = utils.getLong();
		return orderDAO.delete(orderID);
	}

	
}

