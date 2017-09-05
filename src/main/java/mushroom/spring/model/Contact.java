package mushroom.spring.model;

/**
 * This class implements simple contact details.
 * 
 * @author Eugene Robb
 * @version 1.0
 * @since 2017
 *
 */
public class Contact {
	private int contact_id;
	private int contact_telephone;
	private String contact_message;
	private String contact_email;
	private String contact_name;

	public Contact() {
	}

	/**
	 * This contructs contact details with specified telephone, message, email and
	 * name
	 * 
	 * @param contact_telephone
	 *            the contact telephone
	 * @param contact_message
	 *            the contact message
	 * @param contact_email
	 *            the contact email
	 * @param contact_name
	 *            the contact name
	 */
	public Contact(int contact_telephone, String contact_message, String contact_email, String contact_name) {
		this.contact_telephone = contact_telephone;
		this.contact_message = contact_message;
		this.contact_email = contact_email;
		this.contact_name = contact_name;
	}

	/**
	 * This returns the contact ID of this contact
	 * 
	 * @return this contacts ID
	 */
	public int getContact_id() {
		return contact_id;
	}

	/**
	 * This sets the contact ID of this contact
	 * 
	 * @param contact_id
	 *            the contacts ID
	 */
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	/**
	 * This returns the telephone number of this contact
	 * 
	 * @return this contacts telephone
	 */
	public int getContact_telephone() {
		return contact_telephone;
	}

	/**
	 * This sets the contact telephone of this contact
	 * 
	 * @param contact_telephone
	 *            the contact telephone
	 */
	public void setContact_telephone(int contact_telephone) {
		this.contact_telephone = contact_telephone;
	}

	/**
	 * This returns the contact message of this contact
	 * 
	 * @return this contacts message
	 */
	public String getContact_message() {
		return contact_message;
	}

	/**
	 * This sets the contact message of this contact
	 * 
	 * @param contact_message
	 *            the contact message
	 */
	public void setContact_message(String contact_message) {
		this.contact_message = contact_message;
	}

	/**
	 * This returns the contact email of this contact
	 * 
	 * @return this contacts email
	 */
	public String getContact_email() {
		return contact_email;
	}

	/**
	 * This sets the contact email of this contact
	 * 
	 * @param contact_email
	 *            the contacts email
	 */
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}

	/**
	 * This returns the contact name of this contact
	 * 
	 * @return this contacts name
	 */
	public String getContact_name() {
		return contact_name;
	}

	/**
	 * This sets the contact name of this contact
	 * 
	 * @param contact_name
	 *            the contact name
	 */
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

}
