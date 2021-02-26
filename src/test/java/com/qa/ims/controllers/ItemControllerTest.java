package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemControllerTest {

	
	@Mock
	private Utils utils;
	
	@Mock 
	private ItemDAO dao;
	
	@InjectMocks
	private ItemController controller;
	
	@Test
	public void testCreate() {
		final String name = "item01";
		final Double price = 10.50D;
		final Item created = new Item(name, price);

		Mockito.when(utils.getString()).thenReturn(name);
		Mockito.when(utils.getDouble()).thenReturn(price);

		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());
 
		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}
	@Test
	public void testReadAll() {
		List<Item> Items = new ArrayList<>();
		Items.add(new Item(1L, "item1", 15.50D));

		Mockito.when(dao.readAll()).thenReturn(Items);

		assertEquals(Items, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}
	@Test
	public void testUpdate() {
		Item updated = new Item(1L, "item1", 10.50D);

		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getString()).thenReturn(updated.getItemName());
		Mockito.when(this.utils.getDouble()).thenReturn(updated.getItemPrice());

		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(2)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();

		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(utils.getString()).thenReturn("X");
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(utils, Mockito.times(1)).getString();

		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}
}


