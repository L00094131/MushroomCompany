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
	private int inventory_id;
	private String vendor;
	private String cost;
	private String quantity;
	private String jar_size;
	private String sell_by_date;
	private String mushroom_type;

	public Inventory() {
	}

	/**
	 * This constructs the inventory with cost, quantity, jar size, sell by date and
	 * mushroom type
	 * 
	 * @param cost
	 *            cost of mushroom
	 * @param quantity
	 *            quantity of mushroom remaining
	 * @param jar_size
	 *            jar size small,medium,large
	 * @param sell_By_Date
	 *            contains date to sell by
	 * @param mushroom_Type
	 *            types of mushroom
	 */
	public Inventory(int inventory_id, String vendor, String cost, String quantity, String jar_size,
			String sell_by_date, String mushroom_type) {
		this.inventory_id = inventory_id;
		this.vendor = vendor;
		this.cost = cost;
		this.quantity = quantity;
		this.jar_size = jar_size;
		this.sell_by_date = sell_by_date;
		this.mushroom_type = mushroom_type;
	}

	/**
	 * Returns the Inventory ID of the inventory
	 * 
	 * @return inventory id
	 */
	public int getInventory_id() {
		return inventory_id;
	}

	/**
	 * This sets the Inventory ID of this Inventory
	 * 
	 * @param inventory_ID
	 *            the inventory id
	 */
	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}

	/**
	 * Returns the Vendor ID
	 * 
	 * @return Vendor ID
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * This sets the Vendor ID
	 * 
	 * @param vendor_ID
	 *            the vendor id
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * Returns the Cost
	 * 
	 * @return Cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * This sets the cost of mushroom
	 * 
	 * @param cost
	 *            the mushroom cost
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * Returns the mushroom quantity remaining
	 * 
	 * @return Quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * This sets the quantity of mushrooms
	 * 
	 * @param quantity
	 *            the mushroom quantity
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * Returns the mushroom jar size
	 * 
	 * @return jar size
	 */
	public String getJar_size() {
		return jar_size;
	}

	/**
	 * This sets the jar size
	 * 
	 * @param jar_size
	 *            mushroom jar sizes
	 */
	public void setJar_size(String jar_size) {
		this.jar_size = jar_size;
	}

	/**
	 * Returns the mushroom sell by date
	 * 
	 * @return sell by date
	 */
	public String getSell_by_date() {
		return sell_by_date;
	}

	/**
	 * This sets the sell by date of mushrooms
	 * 
	 * @param sell_By_Date
	 *            final date to sell mushrooms
	 */
	public void setSell_by_date(String sell_by_date) {
		this.sell_by_date = sell_by_date;
	}

	/**
	 * Returns the mushroom type
	 * 
	 * @return mushroom type
	 */
	public String getMushroom_type() {
		return mushroom_type;
	}

	/**
	 * This sets the type of mushroom
	 * 
	 * @param mushroom_Type
	 *            mushroom types
	 */
	public void setMushroom_type(String mushroom_type) {
		this.mushroom_type = mushroom_type;
	}

}
