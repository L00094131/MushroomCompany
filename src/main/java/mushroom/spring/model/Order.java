package mushroom.spring.model;

/**
 * this class implements a basic order
 * 
 * @author John
 *
 */
public class Order {

	// declare variables
    private int Order_ID;
	private int Inventory_ID;
	private int Customer_ID;
	private String Mushroom_Type;
	private String Jar_size;
	private String Quantity;
	private String Sell_By_Date;
	private String Deliver_Date;

	
	public Order() {

	}

	

	/**
	 * @param Inventory_ID
	 * Inventory id of stock 
	 * @param Customer_ID
	 * Customer id 
	 * @param Mushroom_Type
	 * type of mushroom
	 * @param Jar_Size
	 * ize of jar of mushrooms
	 * @param Quantity
	 * quantity of product to be ordered by customer
	 * @param Sell_By_Date
	 * expiration date of product
	 * @param Delivery
	 * delivery date of product to the customer
	 */
	public Order(int Order_ID, int Inventory_ID, int Customer_ID, String Mushroom_Type, String Jar_size, String Quantity,
			String Sell_By_Date, String Deliver_Date) {
		
        this.Order_ID= Order_ID;
		this.Inventory_ID = Inventory_ID;
		this.Customer_ID = Customer_ID;
		this.Mushroom_Type = Mushroom_Type;
		this.Jar_size = Jar_size;
		this.Quantity = Quantity;
		this.Sell_By_Date = Sell_By_Date;
		this.Deliver_Date = Deliver_Date;
	}
	// getter and setters
    /**
     * this returns the order id of this customer
     * 
     * @return order id 
     */
    public int getOrder_ID() {
    	return Order_ID;
    }
    
    /**
     * this sets the order of this customer 
     * @param Order_ID
     *  the order id
     */
    public void setOrder_ID(int order_Id) {
    	this.Order_ID= order_Id;
    }
	/**
	 * this returns the inventory id of an order
	 * @return inventory id
	 */
	public int getInventory_ID() {
		return Inventory_ID;
	}

	/**
	 * this sets the inventory id of an order
	 * @param Inventory_ID
	 * inventory id 
	 */
	public void setInventory_ID(int Inventory_ID) {
		this.Inventory_ID = Inventory_ID;
	}

	/**
	 * this returns the customer id for an order
	 * @return
	 */
	public int getCustomer_ID() {
		return Customer_ID;
	}

	/**
	 * this sets the customer id for an order
	 * @param customer_ID
	 */
	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}

	/**
	 * this gets the mushroom type for an order
	 * @return
	 */
	public String getMushroom_Type() {
		return Mushroom_Type;
	}

	/**
	 * this sets the mushroom type for an order
	 * @param mushroom_Type
	 */
	public void setMushroom_Type(String mushroom_Type) {
		Mushroom_Type = mushroom_Type;
	}

	/**
	 * this gets the jar size for an order
	 * @return
	 */
	public String getJar_size() {
		return Jar_size;
	}

	/**
	 * this sets the jar size of an order
	 * @param jar_Size
	 */
	public void setJar_size(String jar_size) {
		Jar_size = jar_size;
	}

	/**
	 * this gets the quantity for an order
	 * @return
	 */
	public String getQuantity() {
		return Quantity;
	}

	/**
	 * this sets the quantity for an order
	 * @param quantity
	 */
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	/**
	 * this gets the sell by date of the mushroom for the order
	 * @return
	 */
	public String getSell_By_Date() {
		return Sell_By_Date;
	}

	/**
	 * this sets the sell by date for the mushroom for an order
	 * @param sell_By_Date
	 */
	public void setSell_By_Date(String sell_By_Date) {
		Sell_By_Date = sell_By_Date;
	}

	/**
	 * this gets the delivery date for an order
	 * @return
	 */
	public String getDeliver_Date() {
		return Deliver_Date;
	}

	/**
	 * this sets the delivery date for an order
	 * @param delivery
	 */
	public void setDeliver_Date(String deliver_Date) {
		Deliver_Date = deliver_Date;
	}

}
