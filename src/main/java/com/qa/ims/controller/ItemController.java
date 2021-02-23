package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class ItemController implements CrudController<Item> {
	//ItemController.java
	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDAO;
	private Utils utils;

	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Item> readAll() {
		List<Item> items = itemDAO.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}

	/**
	 * Creates an item by taking user input
	 */
	@Override
	public Item create() {
		LOGGER.info("Please enter a item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter a item price");
		float itemPrice = utils.getfloat();
		Item item = itemDAO.create(new Item(itemName, itemPrice));
		LOGGER.info("Item created");
		return item;
	}

	/**
	 * Updates existing item by taking user input
	 */
	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter an item name");
		String itemName = utils.getString();
		LOGGER.info("please enter a price");
		float itemPrice = utils.getfloat();
		Item item = itemDAO.update(new Item(itemId, itemName, itemPrice));
		LOGGER.info("Items Updated");
		return item;
	}

	/**
	 * Deletes an existing item by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		Long itemId = utils.getLong();
		return itemDAO.delete(itemId);
	}

}
