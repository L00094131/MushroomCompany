package mushroom.spring.model;

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

	public Customer(String customer_first_name, String customer_last_name, String customer_email, String customer_address, String customer_phone_number, String customer_password, String customer_postcode, String customer_type) {
		this.customer_first_name = customer_first_name;
		this.customer_last_name = customer_last_name;
		this.customer_email = customer_email;
		this.customer_address = customer_address;
		this.customer_phone_number = customer_phone_number;
		this.customer_password = customer_password;
		this.customer_postcode = customer_postcode;
		this.customer_type = customer_type;
	}


	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_first_name() {
		return customer_first_name;
	}

	public void setCustomer_first_name(String customer_first_name) {
		this.customer_first_name = customer_first_name;
	}

	public String getCustomer_last_name() {
		return customer_last_name;
	}

	public void setCustomer_last_name(String customer_last_name) {
		this.customer_last_name = customer_last_name;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_phone_number() {
		return customer_phone_number;
	}

	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	public String getCustomer_postcode() {
		return customer_postcode;
	}

	public void setCustomer_postcode(String customer_postcode) {
		this.customer_postcode = customer_postcode;
	}

	public String getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}



}

