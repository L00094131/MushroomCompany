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