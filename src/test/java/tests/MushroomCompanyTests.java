package tests;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mushroom.spring.model.*;

public class MushroomCompanyTests {

	// Vendor tests by Michael
	@Test
	public void VendorConstructor() {
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

	// Contact tests by Eugene
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

	// JUnit tests go here
	// Test by Nicky
	// not advised to write Unit Test for Getters and Setters
	// getters and setters offer no functionality which could be tested

	@Test
	public void CustomerConstructor() {
		Customer customer = new Customer("nicky", "duffy", "nd@gmail.com", "Lifford", "0860781102", "password",
				"postcode", "primary");
		assertTrue(customer.getCustomer_first_name() == "nicky");
		assertTrue(customer.getCustomer_last_name() == "duffy");
		assertTrue(customer.getCustomer_email() == "nd@gmail.com");
		assertTrue(customer.getCustomer_address() == "Lifford");
		assertTrue(customer.getCustomer_phone_number() == "0860781102");
		assertTrue(customer.getCustomer_password() == "password");
		assertTrue(customer.getCustomer_postcode() == "postcode");
		assertTrue(customer.getCustomer_type() == "primary");
	}

	@Test
	public void testsetCustomer_first_name() {
		Customer customer = new Customer();
		customer.setCustomer_first_name("test");
		assertTrue(customer.getCustomer_first_name() == "test");
	}

	@Test
	public void testgetCustomer_first_name() {
		Customer customer = new Customer();
		customer.setCustomer_first_name("test");
		assertTrue(customer.getCustomer_first_name() == "test");
	}


	//JUnit tests go here
	//Test by Nicky for Employee Class (test constructor)
	//not advised to write Unit Test for Getters and Setters
	//getters and setters tested to show 100% code coverage on jacoco
	
	@Test
	public void EmployeeConstructor() {
		Employee employee = new Employee("nicky", "duffy", "Lifford", "postcode", "nd@gmail.com", 123456, "password");
		assertTrue(employee.getEmployee_first_name() == "nicky");
		assertTrue(employee.getEmployee_last_name() == "duffy");
		assertTrue(employee.getEmployee_address() == "Lifford");
		assertTrue(employee.getEmployee_postcode() == "postcode");
		assertTrue(employee.getEmployee_email() == "nd@gmail.com");
		assertTrue(employee.getEmployee_phone_number() == 123456);
		assertTrue(employee.getEmployee_password() == "password");		

	}	
	
	@Test
	public void testsetEmployee_id() {
		Employee employee = new Employee();
		employee.setEmployee_id(12345);
		assertTrue(employee.getEmployee_id() == 12345);
	}
	
	@Test
	public void testsetEmployee_first_name() {
		Employee employee = new Employee();
		employee.setEmployee_first_name("nicky");
		assertTrue(employee.getEmployee_first_name() == "nicky");
	}

	@Test
	public void testsetEmployee_last_name() {
		Employee employee = new Employee();
		employee.setEmployee_last_name("duffy");
		assertTrue(employee.getEmployee_last_name() == "duffy");
	}

	@Test
	public void testsetEmployee_address() {
		Employee employee = new Employee();
		employee.setEmployee_address("Lifford");
		assertTrue(employee.getEmployee_address() == "Lifford");
	}

	@Test
	public void testsetEmployee_postcode() {
		Employee employee = new Employee();
		employee.setEmployee_postcode("postcode");
		assertTrue(employee.getEmployee_postcode() == "postcode");
	}
	
	@Test
	public void testgetEmployee_email() {
		Employee employee = new Employee();
		employee.setEmployee_email("nd@gmail.com");
		assertTrue(employee.getEmployee_email() == "nd@gmail.com");
	}
	@Test
	public void testgetEmployee_phone_number() {
		Employee employee = new Employee();
		employee.setEmployee_phone_number(12345);
		assertTrue(employee.getEmployee_phone_number() == 12345);
	}
	@Test
	public void testgetEmployee_password() {
		Employee employee = new Employee();
		employee.setEmployee_password("password");
		assertTrue(employee.getEmployee_password() == "password");
	}
	
	//Test by Nico for Inventory
	//No need to write Unit Test for Getters and Setters (no real functionality to test)
	
	@Test
	public void InventoryConstructor() {
		Inventory inventory = new Inventory(1, 200, 25, "Medium", "12/02/17", "Test");
		assertTrue(inventory.getVendor_ID() == 1);
		assertTrue(inventory.getCost() == 200);
		assertTrue(inventory.getQuantity() == 25);
		assertTrue(inventory.getJar_size() == "Medium");
		assertTrue(inventory.getSell_By_Date() == "12/02/17");
		assertTrue(inventory.getMushroom_Type() == "Test");
	}	
	
	@Test
	public void testsetJar_size() {
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
	
	
	//Order tests by John
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

