package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
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
}
