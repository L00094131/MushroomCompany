CREATE TABLE Employee (
    Employee_ID int NOT NULL,
    Employee_Last_Name varchar(255) NOT NULL,
    Employee_First_Name varchar(255) NOT NULL,
	Employee_Address varchar(255),
	Employee_Postcode varchar(255),
	Employee_Email varchar(255),
	Employee_Phone_Number int,
	Employee_Password varchar(255),
	Primary Key (Employee_ID)
);
