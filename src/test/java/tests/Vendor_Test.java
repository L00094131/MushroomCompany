package tests;

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
	

}
