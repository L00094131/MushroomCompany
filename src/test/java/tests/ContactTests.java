package tests;

//Author: Eugene Robb
//Date: 05/09/17
//Desc: This class contains basic JUnit tests for the Contact class.
//


import mushroom.spring.model.Contact;
import static org.junit.Assert.*;
import org.junit.Test;



public class ContactTests {
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
