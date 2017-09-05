package mushroom.spring.model;

/**
 * This class implements a simple employee.
 * 
 * @author Nicky Duffy
 * @version 1.0
 * @since 2017
 * constructor / getters / setters
 */

public class Employee {
	private int employee_id;
	private String employee_first_name;
	private String employee_last_name;
	private String employee_address;
	private String employee_postcode;
	private String employee_email;
	private String employee_phone_number;
	private String employee_password;
	
	public Employee() {
	}
		
	
	public Employee(String employee_first_name, String employee_last_name, String employee_address,
			String employee_postcode, String employee_email, String employee_phone_number, String employee_password) {
		this.employee_first_name = employee_first_name;
		this.employee_last_name = employee_last_name;
		this.employee_address = employee_address;
		this.employee_postcode = employee_postcode;
		this.employee_email = employee_email;
		this.employee_phone_number = employee_phone_number;
		this.employee_password = employee_password;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public String getEmployee_first_name() {
		return employee_first_name;
	}


	public void setEmployee_first_name(String employee_first_name) {
		this.employee_first_name = employee_first_name;
	}


	public String getEmployee_last_name() {
		return employee_last_name;
	}


	public void setEmployee_last_name(String employee_last_name) {
		this.employee_last_name = employee_last_name;
	}


	public String getEmployee_address() {
		return employee_address;
	}


	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}


	public String getEmployee_postcode() {
		return employee_postcode;
	}


	public void setEmployee_postcode(String employee_postcode) {
		this.employee_postcode = employee_postcode;
	}


	public String getEmployee_email() {
		return employee_email;
	}


	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}


	public String getEmployee_phone_number() {
		return employee_phone_number;
	}


	public void setEmployee_phone_number(String employee_phone_number) {
		this.employee_phone_number = employee_phone_number;
	}


	public String getEmployee_password() {
		return employee_password;
	}


	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}
	
}
