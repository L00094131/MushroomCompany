CREATE TABLE Inventory (
    Inventory_ID int NOT NULL,
    Mushroom_Type varchar(255) NOT NULL,
	Sell_By_Date varchar(255),
	Jar_size varchar(255),
	Quantity int,
	Cost int,
	Vendor_ID int,
	Primary Key (Inventory_ID),
	Foreign Key (Vendor_ID) References Vendor(Vendor_ID)
);
