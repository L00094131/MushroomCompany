package mushroom.spring.model;

/**
 * This class implements a simple employee.
 * 
 * @author Nicky Duffy
 * @version 1.0
 * @since 2017 constructor / getters / setters
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

	/**
	 * This constructs an Employee with specified first name, last name, address,
	 * postcode, email, phone number and password.
	 * 
	 * @param employee_first_name
	 *            the employee's first name
	 * @param employee_last_name
	 *            the employee's last name
	 * @param employee_address
	 *            the employee's address
	 * @param employee_postcode
	 *            the employee's postcode
	 * @param employee_email
	 *            the employee's email
	 * @param employee_phone_number
	 *            the employee's phone number
	 * @param employee_password
	 *            the employee's password
	 */
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

	/**
	 * This returns the employee ID of this employee
	 * 
	 * @return this employee's ID
	 */
	public int getEmployee_id() {
		return employee_id;
	}

	/**
	 * Sets the employee ID of this employee
	 * 
	 * @param employee_id
	 *            the employee's ID
	 */
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	/**
	 * This returns the employee first name of this employee
	 * 
	 * @return this employee's first name
	 */
	public String getEmployee_first_name() {
		return employee_first_name;
	}

	/**
	 * Sets the employee first name of this employee
	 * 
	 * @param employee_first_name
	 *            the employee's first name
	 */
	public void setEmployee_first_name(String employee_first_name) {
		this.employee_first_name = employee_first_name;
	}

	/**
	 * This returns the employee last name of this employee
	 * 
	 * @return this employee's last name
	 */
	public String getEmployee_last_name() {
		return employee_last_name;
	}

	/**
	 * Sets the employee's last name of this employee
	 * 
	 * @param employee_last_name
	 *            the employee's last name
	 */
	public void setEmployee_last_name(String employee_last_name) {
		this.employee_last_name = employee_last_name;
	}

	/**
	 * This returns the employee's address of this employee
	 * 
	 * @return this employee's address
	 */
	public String getEmployee_address() {
		return employee_address;
	}

	/**
	 * Sets the employee address of this employee
	 * 
	 * @param employee_address
	 *            the employee's address
	 */
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}

	/**
	 * This returns the employee postcode of this employee
	 * 
	 * @return this employee's postcode
	 */
	public String getEmployee_postcode() {
		return employee_postcode;
	}

	/**
	 * Sets the employee postcode of this employee
	 * 
	 * @param employee_postcode
	 *            the employee's postcode
	 */
	public void setEmployee_postcode(String employee_postcode) {
		this.employee_postcode = employee_postcode;
	}

	/**
	 * This returns the employee email of this employee
	 * 
	 * @return this employee's email
	 */
	public String getEmployee_email() {
		return employee_email;
	}

	/**
	 * Sets the employee email of this employee
	 * 
	 * @param employee_email
	 *            the employee's email
	 */
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	/**
	 * This returns the employee phone number of this employee
	 * 
	 * @return this employee's phone number
	 */
	public String getEmployee_phone_number() {
		return employee_phone_number;
	}

	/**
	 * Sets the employee phone number of this employee
	 * 
	 * @param employee_phone_number
	 *            the employee's phone number
	 */
	public void setEmployee_phone_number(String employee_phone_number) {
		this.employee_phone_number = employee_phone_number;
	}

	/**
	 * This returns the employee password of this employee
	 * 
	 * @return this employee's password
	 */
	public String getEmployee_password() {
		return employee_password;
	}

	/**
	 * Sets the employee password of this employee
	 * 
	 * @param employee_password
	 *            the employee's password
	 */
	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}

}
