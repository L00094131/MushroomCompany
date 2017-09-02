package customer_tests;

import mushroom.spring.model.Customer;
import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTests {
	
	
	//JUnit tests go here
	//Test by Nicky
	//not advised to write Unit Test for Getters and Setters
	//getters and setters offer no functionality which could be tested
	
	@Test
	public void constructor() {
		Customer customer = new Customer("nicky", "duffy", "nd@gmail.com", "Lifford", "0860781102", "password", "postcode", "primary");
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
}
