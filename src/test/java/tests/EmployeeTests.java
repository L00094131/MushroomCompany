package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mushroom.spring.model.Customer;
import mushroom.spring.model.Employee;

public class EmployeeTests {

	//JUnit tests go here
	//Test by Nicky for Employee Class (test constructor)
	//not advised to write Unit Test for Getters and Setters
	//getters and setters offer no functionality which could be tested
	
	@Test
	public void constructor() {
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
	public void testsetEmployee_first_name() {
		Employee employee = new Employee();
		employee.setEmployee_first_name("test");
		assertTrue(employee.getEmployee_first_name() == "test");
	}
	@Test
	public void testgetCustomer_first_name() {
		Employee employee = new Employee();
		employee.setEmployee_first_name("test");
		assertTrue(employee.getEmployee_first_name() == "test");
	}
}
