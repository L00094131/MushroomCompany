CREATE TABLE Vendor (
    Vendor_ID int NOT NULL,
    Vendor_Name varchar(255) NOT NULL,
	Vendor_Address varchar(255),
	Vendor_Email varchar(255),
	Vendor_Phone_Number int,
	Mushroom_Type varchar(255),
	Quantity int NOT NULL,
	Primary Key (Vendor_ID),
);
