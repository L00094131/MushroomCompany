package mushroom.spring.model;

/**
 * this class implements a basic order
 * 
 * @author John
 *
 */
public class Order {

	// declare variables
	private int order_id;
	private String quantity;
	private String jar_size;
	private String mushroom_type;
	private String name;
	private String address;

	public Order() {
	}

	/**
	 * @param Inventory_ID
	 *            Inventory id of stock
	 * @param Mushroom_Type
	 *            type of mushroom
	 * @param Jar_Size
	 *            ize of jar of mushrooms
	 * @param Quantity
	 *            quantity of product to be ordered by customer
	 */
	public Order(int order_id, String quantity, String jar_size, String mushroom_type, String name, String address) {
		this.order_id = order_id;
		this.quantity = quantity;
		this.jar_size = jar_size;
		this.mushroom_type = mushroom_type;
		this.name = name;
		this.address = address;
	}

	// getter and setters
	/**
	 * this returns the order id of this customer
	 * 
	 * @return order id
	 */
	public int getOrder_id() {
		return order_id;
	}

	/**
	 * this sets the order of this customer
	 * 
	 * @param Order_ID
	 *            the order id
	 */
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	/**
	 * this gets the mushroom type for an order
	 * 
	 * @return
	 */
	public String getMushroom_type() {
		return mushroom_type;
	}

	/**
	 * this sets the mushroom type for an order
	 * 
	 * @param mushroom_Type
	 */
	public void setMushroom_type(String mushroom_type) {
		this.mushroom_type = mushroom_type;
	}

	/**
	 * this gets the jar size for an order
	 * 
	 * @return
	 */
	public String getJar_size() {
		return jar_size;
	}

	/**
	 * this sets the jar size of an order
	 * 
	 * @param jar_Size
	 */
	public void setJar_size(String jar_size) {
		this.jar_size = jar_size;
	}

	/**
	 * this gets the quantity for an order
	 * 
	 * @return
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * this sets the quantity for an order
	 * 
	 * @param quantity
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
