package mushroom.spring.model;

/**
 * This class implements a simple customer.
 * 
 * @author Eugene Robb
 * @version 1.0
 * @since 2017
 *
 */
public class Customer {
	private int customer_id;
	private String customer_first_name;
	private String customer_last_name;
	private String customer_email;
	private String customer_address;
	private String customer_phone_number;
	private String customer_password;
	private String customer_postcode;
	private String customer_type;

	public Customer() {
	}

	/**
	 * This constructs a customer with specified first name, last name, email,
	 * address phone number, password, postcode and type.
	 * 
	 * @param customer_first_name
	 *            the customers first name
	 * @param customer_last_name
	 *            the customers last name
	 * @param customer_email
	 *            the customers email
	 * @param customer_address
	 *            the customers address
	 * @param customer_phone_number
	 *            the customers phone number
	 * @param customer_password
	 *            the customers password
	 * @param customer_postcode
	 *            the customers postcode
	 * @param customer_type
	 *            the type of the customer
	 */
	public Customer(String customer_first_name, String customer_last_name, String customer_email,
			String customer_address, String customer_phone_number, String customer_password, String customer_postcode,
			String customer_type) {
		this.customer_first_name = customer_first_name;
		this.customer_last_name = customer_last_name;
		this.customer_email = customer_email;
		this.customer_address = customer_address;
		this.customer_phone_number = customer_phone_number;
		this.customer_password = customer_password;
		this.customer_postcode = customer_postcode;
		this.customer_type = customer_type;
	}

	/**
	 * This returns the customer ID of this customer
	 * 
	 * @return this customer's ID
	 */
	public int getCustomer_id() {
		return customer_id;
	}

	/**
	 * This sets the customer ID of this customer
	 * 
	 * @param customer_id
	 *            the customers ID
	 */
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * This returns the customer first name of this customers
	 * 
	 * @return this customers first name
	 */
	public String getCustomer_first_name() {
		return customer_first_name;
	}

	/**
	 * This sets the customer first name of this customer
	 * 
	 * @param customer_first_name
	 *            the customers first name
	 */
	public void setCustomer_first_name(String customer_first_name) {
		this.customer_first_name = customer_first_name;
	}

	/**
	 * This returns the customer last name of this customer
	 * 
	 * @return this customers last name
	 */
	public String getCustomer_last_name() {
		return customer_last_name;
	}

	/**
	 * This sets the customer last name of this customer
	 * 
	 * @param customer_last_name
	 *            the customers last name
	 */
	public void setCustomer_last_name(String customer_last_name) {
		this.customer_last_name = customer_last_name;
	}

	/**
	 * This returns the customer email of this customer
	 * 
	 * @return this customers email
	 */
	public String getCustomer_email() {
		return customer_email;
	}

	/**
	 * This sets the customer email of this customer
	 * 
	 * @param customer_email
	 *            the customers email
	 */
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	/**
	 * This returns the customer address of this customer
	 * 
	 * @return this customers address
	 */
	public String getCustomer_address() {
		return customer_address;
	}

	/**
	 * This sets the customer address of this customer
	 * 
	 * @param customer_address
	 *            the customers address
	 */
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	/**
	 * This returns the customer phone number of this customer
	 * 
	 * @return this customers phone number
	 */
	public String getCustomer_phone_number() {
		return customer_phone_number;
	}

	/**
	 * This sets the customer phone number of this customer
	 * 
	 * @param customer_phone_number
	 *            the customers phone number
	 */
	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}

	/**
	 * This returns the customer password of this customer
	 * 
	 * @return this customers password
	 */
	public String getCustomer_password() {
		return customer_password;
	}

	/**
	 * This sets the customer password of this customer
	 * 
	 * @param customer_password
	 *            the customers password
	 */
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	/**
	 * This returns the customer postcode of this customer
	 * 
	 * @return this customers postcode
	 */
	public String getCustomer_postcode() {
		return customer_postcode;
	}

	/**
	 * This sets the customer postcode of this customer
	 * 
	 * @param customer_postcode
	 *            the customers postcode
	 */
	public void setCustomer_postcode(String customer_postcode) {
		this.customer_postcode = customer_postcode;
	}

	/**
	 * This returns the customer type of this customer
	 * 
	 * @return this customer type
	 */
	public String getCustomer_type() {
		return customer_type;
	}

	/**
	 * This sets the customer type of the customer
	 * 
	 * @param customer_type
	 *            the customer type
	 */
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
}
