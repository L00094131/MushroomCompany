CREATE TABLE Orders (
    Order_ID int NOT NULL,
    Customer_ID int NOT NULL,
    Deliver_Date varchar(255) NOT NULL,
	Jar_size varchar(255),
	Mushroom_Type varchar(255),
	Sell_By_Date varchar(255),
	Quantity int,
	Inventory_ID int NOT NULL,
	Primary Key (Order_ID),
	Foreign Key(Customer_ID) References Customer(Customer_ID),
	Foreign Key(Inventory_ID) References Inventory(Inventory_ID),
);
