package mushroom.spring.model;

public class Vendor {
	
	private int vendor_id;
	private String vendor_name;
	private String vendor_email;
	private String vendor_address;
	private String vendor_phone_number;
	private String mushroom_type;
	private int quantity;
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getVendor_email() {
		return vendor_email;
	}
	public void setVendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}
	public String getVendor_address() {
		return vendor_address;
	}
	public void setVendor_address(String vendor_address) {
		this.vendor_address = vendor_address;
	}
	public String getVendor_phone_number() {
		return vendor_phone_number;
	}
	public void setVendor_phone_number(String vendor_phone_number) {
		this.vendor_phone_number = vendor_phone_number;
	}
	public String getMushroom_type() {
		return mushroom_type;
	}
	public void setMushroom_type(String mushroom_type) {
		this.mushroom_type = mushroom_type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Vendor() {
		
	}
	
	public Vendor(String vendor_name, String vendor_email, String vendor_address, String vendor_phone_number,
			String mushroom_type, int quantity) {
		super();
		this.vendor_name = vendor_name;
		this.vendor_email = vendor_email;
		this.vendor_address = vendor_address;
		this.vendor_phone_number = vendor_phone_number;
		this.mushroom_type = mushroom_type;
		this.quantity = quantity;
	}
	
	
	
	
	
	
	
	
		
	
}
