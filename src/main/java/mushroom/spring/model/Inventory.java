package mushroom.spring.model;

/**
 * Class for Inventory
 * 
 * @author Nico
 * @version 1.0
 * @since 2017
 *
 */
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

	/**
	 * This constructs the inventory with cost, quantity, jar size, sell by date and mushroom type
	 * 
	 * @param cost
	 * 		cost of mushroom
	 * @param quantity
	 * 		quantity of mushroom remaining
	 * @param jar_size
	 * 		jar size small,medium,large
	 * @param sell_By_Date
	 * 		contains date to sell by
	 * @param mushroom_Type
	 * 		types of mushroom
	 */
	public Inventory(int cost, int quantity, String jar_size, String sell_By_Date, String mushroom_Type) {
		super();
		Cost = cost;
		Quantity = quantity;
		Jar_size = jar_size;
		Sell_By_Date = sell_By_Date;
		Mushroom_Type = mushroom_Type;
	}
	
	/**
	 * Returns the Inventory ID of the inventory
	 * @return inventory id
	 */
	public int getInventory_ID() {
		return Inventory_ID;
	}

	/**
	 * This sets the Inventory ID of this Inventory
	 * @param inventory_ID
	 * 				the inventory id
	 */
	public void setInventory_ID(int inventory_ID) {
		Inventory_ID = inventory_ID;
	}

	/**
	 * Returns the Vendor ID
	 * @return Vendor ID
	 */
	public int getVendor_ID() {
		return Vendor_ID;
	}

	/**
	 * This sets the Vendor ID
	 * @param vendor_ID
	 * 				the vendor id
	 */
	public void setVendor_ID(int vendor_ID) {
		Vendor_ID = vendor_ID;
	}

	/**
	 * Returns the Cost
	 * @return Cost
	 */
	public int getCost() {
		return Cost;
	}

	/**
	 * This sets the cost of mushroom
	 * @param cost
	 * 			the mushroom cost
	 */
	public void setCost(int cost) {
		Cost = cost;
	}

	/**
	 * Returns the mushroom quantity remaining
	 * @return Quantity
	 */
	public int getQuantity() {
		return Quantity;
	}

	/**
	 * This sets the quantity of mushrooms 
	 * @param quantity
	 * 			the mushroom quantity
	 */
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	/**
	 * Returns the mushroom jar size
	 * @return jar size
	 */
	public String getJar_size() {
		return Jar_size;
	}

	/**
	 * This sets the jar size
	 * @param jar_size
	 * 				mushroom jar sizes
	 */
	public void setJar_size(String jar_size) {
		Jar_size = jar_size;
	}

	/**
	 * Returns the mushroom sell by date
	 * @return sell by date
	 */
	public String getSell_By_Date() {
		return Sell_By_Date;
	}

	/**
	 * This sets the sell by date of mushrooms
	 * @param sell_By_Date
	 * 				final date to sell mushrooms
	 */
	public void setSell_By_Date(String sell_By_Date) {
		Sell_By_Date = sell_By_Date;
	}

	/**
	 * Returns the mushroom type
	 * @return mushroom type
	 */
	public String getMushroom_Type() {
		return Mushroom_Type;
	}

	/**
	 * This sets the type of mushroom
	 * @param mushroom_Type
	 * 				mushroom types
	 */
	public void setMushroom_Type(String mushroom_Type) {
		Mushroom_Type = mushroom_Type;
	}

}


