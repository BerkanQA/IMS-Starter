package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;
//Item DAO Test
public class ItemDAOTest {

	private final ItemDAO DAO = new ItemDAO();

	@Before
	public void Setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema-items.sql", "src/test/resources/sql-data-items.sql");
	}

	@Test
	public void testCreate() {
		final Item created = new Item(2L, "headphones", 18.50D);
		assertEquals(created, DAO.create(created));
	}
 
	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "item2", 6.50D));
		assertEquals(expected, DAO.readAll());
	}
  
	@Test
	public void testReadLatest() {
		assertEquals(new Item(1L, "item2", 6.50D), DAO.readLatest());
	}
  
	@Test
	public void testRead() {
		final long ID = 1L;
		assertEquals(new Item(ID, "item2", 6.50D), DAO.read(ID));
	}
 
	@Test
			public void testUpdate() {
				final Item updated = new Item(1L, "airpods", 6D);
				assertEquals(updated, DAO.update(updated));
	}

	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
}
