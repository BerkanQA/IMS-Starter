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
	 * Reads all the items 
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
		double itemPrice = utils.getDouble();
		Item item = itemDAO.create(new Item(itemName, itemPrice));
		LOGGER.info("Item created");
		return item;
	}

	/**
	 * Updates existing item by taking user input
	 */
	@Override
	public Item update() {
		LOGGER.info("Please enter the ID of the item you would like to update");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter a NEW item name");
		String itemName = utils.getString();
		LOGGER.info("please enter a NEW price");
		Double itemPrice = utils.getDouble();
		Item item = itemDAO.update(new Item(itemId, itemName, itemPrice));
		LOGGER.info("Items Updated");
		return item;
	}

	/**
	 * Deletes an existing item
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long itemId = utils.getLong();
		return itemDAO.delete(itemId);
	}

}
