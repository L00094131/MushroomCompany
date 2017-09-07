CREATE TABLE Customer (
    Customer_ID int NOT NULL,
    Customer_Last_Name varchar(255) NOT NULL,
    Customer_First_Name varchar(255) NOT NULL,
	Customer_Address varchar(255),
	Customer_Postcode varchar(255),
	Customer_Email varchar(255),
	Customer_Phone_Number int,
	Customer_Password varchar(255),
	Customer_Type varchar(255),
	Primary Key (Customer_ID)
);
