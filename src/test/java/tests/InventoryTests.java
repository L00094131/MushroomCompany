package tests;

import mushroom.spring.model.Inventory;
import static org.junit.Assert.*;
import org.junit.Test;

public class InventoryTests {

	//Test by Nico for Inventory
	//No need to write Unit Test for Getters and Setters (no real functionality to test)
	
	@Test
	public void constructor() {
		Inventory inventory = new Inventory(4052, 7000, 0, "10-12-2017", "truffles", null);
		assertTrue(inventory.getCost() == 4052);
		assertTrue(inventory.getQuantity() == 7000);
		assertTrue(inventory.getJar_size() == "medium");
		assertTrue(inventory.getSell_By_Date() == "10-12-2017");
		assertTrue(inventory.getMushroom_Type() == "truffles");
	}	
	
	@Test
	public void testsetsetJar_size() {
		Inventory inventory = new Inventory();
		inventory.setJar_size("Large");
		assertTrue(inventory.getJar_size() == "Large");
	}
	@Test
	public void testgetMushroom_Type() {
		Inventory inventory = new Inventory();
		inventory.setMushroom_Type("RoundMushroom");
		assertTrue(inventory.getMushroom_Type() == "RoundMushroom");
	}
	
}
