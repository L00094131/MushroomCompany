package tests;

import static org.junit.Assert.assertEquals;

/*
 *  Author Michael McFadden
 *  Description Write junit tests
 *  5-9-2017
 * 
 * 
 */

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mushroom.spring.model.*;


public class Vendor_Test {
	
	@Test
	public void constructor() {
		Vendor vendor = new Vendor("Donegal Mushroom", "dlmushrooms@gmail.com", "Annagry", "07495644363", "Button", 21);
		assertTrue(vendor.getVendor_name() == "Donegal Mushroom");
		assertTrue(vendor.getVendor_email() == "dlmushrooms@gmail.com");
		assertTrue(vendor.getVendor_address() == "Annagry");
		assertTrue(vendor.getVendor_phone_number() == "07495644363");
		assertTrue(vendor.getMushroom_type() == "Button");
		assertTrue(vendor.getQuantity() == 21);		
		
	}	
	
	@Test
	public void testVendorName() {
		Vendor vendor = new Vendor();
		vendor.setVendor_name("Donegal Mushroom");
		assertTrue(vendor.getVendor_name() == "Donegal Mushroom");
	}
	
	
	Contact contact = new Contact("123456789", "This is a sample message for the contact field", "testemail@lyit.ie",
			"Eugene Robb");

	@Test
	public void testPhone() {
		assertEquals("123456789", contact.getContact_telephone());
	}

	@Test
	public void testMessage() {
		assertEquals("This is a sample message for the contact field", contact.getContact_message());
	}
	
	@Test
	public void testEmail() {
		assertEquals("testemail@lyit.ie", contact.getContact_email());
	}
	
	@Test
	public void testName() {
		assertEquals("Eugene Robb", contact.getContact_name());
	}
	

}
