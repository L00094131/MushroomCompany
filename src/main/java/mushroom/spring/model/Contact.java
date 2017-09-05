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
	private String contact_telephone;
	private String contact_message;
	private String contact_email;
	private String contact_name;

	public Contact() {
	}

	public Contact(int contact_id, String contact_telephone, String contact_message, String contact_email,
			String contact_name) {
		this.contact_id = contact_id;
		this.contact_telephone = contact_telephone;
		this.contact_message = contact_message;
		this.contact_email = contact_email;
		this.contact_name = contact_name;
	}

	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	public String getContact_telephone() {
		return contact_telephone;
	}

	public void setContact_telephone(String contact_telephone) {
		this.contact_telephone = contact_telephone;
	}

	public String getContact_message() {
		return contact_message;
	}

	public void setContact_message(String contact_message) {
		this.contact_message = contact_message;
	}

	public String getContact_email() {
		return contact_email;
	}

	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

}
