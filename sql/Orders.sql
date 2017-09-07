<<<<<<< HEAD
create database mushroomdb;
 

CREATE TABLE `Orders`(
 `Order_ID` int (100) NOT NULL AUTO_INCREMENT,
 `Mushroom_Type` varchar(45) NOT NULL,
 `Jar_size` varchar(45) NOT NULL,
 `Quantity` varchar(100) NOT NULL,
 Sell_By_Date varchar(45)NOT NULL,
 Deliver_Date varchar(45) NOT NULL,
 PRIMARY KEY(`Order_ID`)
 ) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8
=======
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
>>>>>>> branch 'master' of https://github.com/L00094131/MushroomCompany
