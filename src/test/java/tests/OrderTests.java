package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import mushroom.spring.model.Order;


public class OrderTests {
	
	@Test
	public void Order() {
		Order order = new Order(01, 01, 01, "Button Mushroom", "Medium", "3", "31st August", "20th August");
		assertTrue(order.getOrder_ID() == 01);
		assertTrue(order.getInventory_ID() == 01);
		assertTrue(order.getCustomer_ID() == 01);
		assertTrue(order.getMushroom_Type() == "Button Mushroom");
		assertTrue(order.getJar_Size() == "Medium");
		assertTrue(order.getQuantity() == "3");		
		assertTrue(order.getSell_By_Date() == "31st August");
		assertTrue(order.getDelivery() == "20th August");
	}	
	
	@Test
	public void testsetOrder_ID() {
		Order order = new Order();
		order.setOrder_ID(01);
		assertTrue(order.getOrder_ID() == 01);
	}
	@Test
	public void testgetOrder_ID() {
		Order order = new Order();
		order.setOrder_ID(01);
		assertTrue(order.getOrder_ID() == 01);
	}

}
