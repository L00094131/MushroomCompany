package mushroom.spring.model;

public class Inventory {
	private int Inventory_ID;
	private int Vendor_ID;
	private int Cost;
	private int Quantity;
	private String Jar_size;
	private String Sell_By_Date;
	private String Mushroom_Type;

	public Inventory() {
	}

	public Inventory(int cost, int quantity, String jar_size, String sell_By_Date, String mushroom_Type) {
		super();
		Cost = cost;
		Quantity = quantity;
		Jar_size = jar_size;
		Sell_By_Date = sell_By_Date;
		Mushroom_Type = mushroom_Type;
	}
	
	public int getInventory_ID() {
		return Inventory_ID;
	}

	public void setInventory_ID(int inventory_ID) {
		Inventory_ID = inventory_ID;
	}

	public int getVendor_ID() {
		return Vendor_ID;
	}

	public void setVendor_ID(int vendor_ID) {
		Vendor_ID = vendor_ID;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getJar_size() {
		return Jar_size;
	}

	public void setJar_size(String jar_size) {
		Jar_size = jar_size;
	}

	public String getSell_By_Date() {
		return Sell_By_Date;
	}

	public void setSell_By_Date(String sell_By_Date) {
		Sell_By_Date = sell_By_Date;
	}

	public String getMushroom_Type() {
		return Mushroom_Type;
	}

	public void setMushroom_Type(String mushroom_Type) {
		Mushroom_Type = mushroom_Type;
	}

}


