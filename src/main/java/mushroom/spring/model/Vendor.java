package mushroom.spring.model;

/**
 * This class implements the Vendor class
 * 
 * @author michael mcfadden...
 * @version 1.0
 * @since 2017
 *
 */
public class Vendor {

	private int vendor_id;
	private String vendor_name;
	private String vendor_email;
	private String vendor_address;
	private String vendor_phone_number;
	private String mushroom_type;
	private int quantity;

	/**
	 * This returns the Vendors ID
	 * 
	 * @return this Vendors ID
	 */
	public int getVendor_id() {
		return vendor_id;
	}

	/**
	 * This sets the Vendor ID of this Vendor
	 * 
	 * @param vendor_id
	 *            The Vendor ID
	 */
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	/**
	 * This returns the Vendors name
	 * 
	 * @return this Vendors name
	 */
	public String getVendor_name() {
		return vendor_name;
	}

	/**
	 * This sets the Vendor name of this Vendor
	 * 
	 * @param vendor_name
	 *            The Vendor name
	 */
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	/**
	 * This returns the Vendors email
	 * 
	 * @return this Vendors email
	 */
	public String getVendor_email() {
		return vendor_email;
	}

	/**
	 * This sets the Vendors email of this Vendor
	 * 
	 * @param vendor_email
	 *            The Vendor email
	 */
	public void setVendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}

	/**
	 * This returns the Vendors address
	 * 
	 * @return this Vendors address
	 */
	public String getVendor_address() {
		return vendor_address;
	}

	/**
	 * This sets the Vendor address of this Vendor 
	 * 
	 * @param vendor_address The Vendor address
	 */
	public void setVendor_address(String vendor_address) {
		this.vendor_address = vendor_address;
	}

	/**
	 * This returns the Vendors phone number
	 * 
	 * @return this Vendors phone number
	 */
	public String getVendor_phone_number() {
		return vendor_phone_number;
	}

	/**
	 * This sets the Vendor phone number of this Vendor 
	 * The Vendor phone number
	 * @param vendor_phone_number
	 */
	public void setVendor_phone_number(String vendor_phone_number) {
		this.vendor_phone_number = vendor_phone_number;
	}

	/**
	 * This returns the Vendors mushroom type
	 * 
	 * @return this Vendors ID mushroom type
	 */
	public String getMushroom_type() {
		return mushroom_type;
	}

	/**
	 * This sets the Vendor mushroom type of this Vendor 
	 * The Vendor mushroom type
	 * @param mushroom_type
	 */
	public void setMushroom_type(String mushroom_type) {
		this.mushroom_type = mushroom_type;
	}

	/**
	 * This returns the Vendors mushroom quantity
	 * 
	 * @return this Vendors mushroom quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * This sets the Vendor mushroom quantity 
	 * The Vendor mushroom quantity
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 
	 */
	public Vendor() {

	}

	/**
	 * This constructs a Vendor with specified vendor name, email, address phone
	 * number, mushroom type and Quantity.
	 * 
	 * @param vendor_name
	 *            The Vendors name
	 * @param vendor_email
	 *            The Vendors email address
	 * @param vendor_address
	 *            The Vendors address
	 * @param vendor_phone_number
	 *            The Vendors phone-number
	 * @param mushroom_type
	 *            The Vendors Mushroom type
	 * @param quantity
	 *            Quantity of mushrooms
	 */
	public Vendor(String vendor_name, String vendor_email, String vendor_address, String vendor_phone_number,
			String mushroom_type, int quantity) {
		this.vendor_name = vendor_name;
		this.vendor_email = vendor_email;
		this.vendor_address = vendor_address;
		this.vendor_phone_number = vendor_phone_number;
		this.mushroom_type = mushroom_type;
		this.quantity = quantity;
	}

}

