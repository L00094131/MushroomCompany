package mushroom.spring.model;

public class Order {
	
	//declare variables
	
	private int inventory_ID;
	private int Customer_ID;
	private String Mushroom_Type;
    private String Jar_Size;
    private String Quantity;
    private String Sell_By_Date;
    private String Delivery;
    
    //Constructor
    
    public Order(int inventory_ID ,int Customer_ID, String  Mushroom_Type ,String Jar_Size, String Quantity, String Sell_By_Date, String Delivery) {
    	 
    	this.inventory_ID =inventory_ID;
    	this.Customer_ID = Customer_ID;
    	this.Mushroom_Type = Mushroom_Type;
    	this.Jar_Size = Jar_Size;
    	this.Quantity = Quantity;
    	this.Sell_By_Date= Sell_By_Date;
    	this.Delivery= Delivery;
    }
    	//getter and setters 
    	

    	
    	
    	public int getInventory_ID() {
    		return inventory_ID;
    	}

    	public void setInventory_ID(int inventory_ID) {
    		this.inventory_ID = inventory_ID;
    	}

    	public int getCustomer_ID() {
    		return Customer_ID;
    	}

    	public void setCustomer_ID(int customer_ID) {
    		Customer_ID = customer_ID;
    	}

    	public String getMushroom_Type() {
    		return Mushroom_Type;
    	}

    	public void setMushroom_Type(String mushroom_Type) {
    		Mushroom_Type = mushroom_Type;
    	}

    	public String getJar_Size() {
    		return Jar_Size;
    	}

    	public void setJar_Size(String jar_Size) {
    		Jar_Size = jar_Size;
    	}

    	public String getQuantity() {
    		return Quantity;
    	}

    	public void setQuantity(String quantity) {
    		Quantity = quantity;
    	}

    	public String getSell_By_Date() {
    		return Sell_By_Date;
    	}

    	public void setSell_By_Date(String sell_By_Date) {
    		Sell_By_Date = sell_By_Date;
    	}

    	public String getDelivery() {
    		return Delivery;
    	}

    	public void setDelivery(String delivery) {
    		Delivery = delivery;
    	}
    	
    	
    }
   
    
	
	


