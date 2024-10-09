
CREATE TABLE tblShippers (
    ShipperID INT PRIMARY KEY,
    CompanyName VARCHAR(100) NOT NULL, 
    CustomerID INT REFERENCES tblCustomers(CustomerID)  
);

select * from tblShippers;

INSERT INTO tblShippers (ShipperID, CompanyName, CustomerID) VALUES
(1, 'DTDC', 101),
(2, 'DHL', 102),
(3, 'ECOM', 103),
(4, 'USPS', 104),
(5, 'Amazon Logistics', 105);
-----------------------------------------------------------------------------
CREATE TABLE tblCustomers (
    CustomerID INT PRIMARY KEY,
    CompanyName TEXT,
    ContactTitle VARCHAR(100),
    Address TEXT,
    City VARCHAR(100),
    Region VARCHAR(100),
    PostalCode INT,
    Country VARCHAR(100) DEFAULT 'Canada',
    Phone VARCHAR(20),  
    Fax VARCHAR(100)
);

select * from tblCustomers;

INSERT INTO tblCustomers (CustomerID, CompanyName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax) VALUES
(101, 'ABC Corp', 'Sales Manager', '123 Elm St', 'Toronto', 'Ontario', 12345, 'Canada', '+1-416-555-1234', '416-555-1235'),
(102, 'XYZ Enterprises', 'Marketing Director', '456 Oak Ave', 'Vancouver', 'British Columbia', 67890, 'Canada', '+1-604-555-6789', '604-555-6790'),
(103, 'Global Traders', 'CEO', '789 Pine Rd', 'Montreal', 'Quebec', 54321, 'Canada', '+1-514-555-5432', '514-555-5433'),
(104, 'Tech Solutions', 'CTO', '321 Birch Blvd', 'Calgary', 'Alberta', 11223, 'Canada', '+1-403-555-1122', '403-555-1123'),
(105, 'Logistics Pro', 'Operations Manager', '654 Maple Lane', 'Ottawa', 'Ontario', 33445, 'Canada', '+1-613-555-3344', '613-555-3345');

--------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE tblOrderDetails (
    OrderID INT,
    ProductID INT REFERENCES tblProducts(ProductID),
    UnitPrice DECIMAL(10, 2),
    Quantity INT,
    Discount DECIMAL(5, 2),
    PRIMARY KEY (OrderID, ProductID)
);


Select * from tblOrderDetails;

INSERT INTO tblOrderDetails (OrderID, ProductID, UnitPrice, Quantity, Discount) VALUES
(1001, 201, 19.99, 3, 0.10),  
(1002, 202, 49.95, 2, 0.05),  
(1003, 203, 15.50, 5, 0.20),  
(1004, 204, 100.00, 1, 0.00), 
(1005, 205, 7.99, 10, 0.15);  

Select * from tblOrderDetails;

--------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE tblSupplier (
    SupplierID INT PRIMARY KEY,
    Name VARCHAR(100),
    Address VARCHAR(100),
    City VARCHAR(50),
    Province VARCHAR(50)
);
Select * from tblSupplier;

INSERT INTO tblSupplier (SupplierID, Name, Address, City, Province) VALUES
(1, 'ABC Supplies', '123 Main St', 'Toronto', 'Ontario'),
(2, 'XYZ Wholesalers', '456 Market Ave', 'Vancouver', 'British Columbia'),
(3, 'Global Importers', '789 Industrial Rd', 'Montreal', 'Quebec'),
(4, 'Quality Goods', '321 Commerce Blvd', 'Calgary', 'Alberta'),
(5, 'Eco-Friendly Products', '654 Green St', 'Ottawa', 'Ontario');

Select * from tblSupplier;

---------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE tblProducts (
    ProductID INT PRIMARY KEY,
    SupplierID INT REFERENCES tblSupplier(SupplierID),
    CategoryID INT,
    ProductName VARCHAR(100),
    EnglishName VARCHAR(100),
    QuantityPerUnit INT,
    UnitPrice REAL,
    UnitInStock INT,
    UnitOnOrder INT,
    ReorderLevel INT,
    Discontinued BOOLEAN
);

Select * from tblProducts;

INSERT INTO tblProducts (ProductID, SupplierID, CategoryID, ProductName, EnglishName, QuantityPerUnit, UnitPrice, UnitInStock, UnitOnOrder, ReorderLevel, Discontinued) VALUES
(201, 1, 101, 'Organic Honey', 'Honey biologique', 1, 12.99, 100, 20, 10, FALSE),
(202, 1, 102, 'Almond Butter', 'Beurre d\amande', 1, 6.49, 50, 10, 5, FALSE),
(203, 2, 101, 'Quinoa', 'Quinoa', 1, 4.99, 200, 30, 15, FALSE),
(204, 3, 103, 'Coconut Oil', 'Huile de noix de coco', 1, 8.99, 75, 5, 3, TRUE),
(205, 4, 102, 'Chia Seeds', 'Graines de chia', 1, 3.99, 150, 25, 10, FALSE);


Select * from tblProducts;
-----------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE tblOrders (
    OrderID SERIAL PRIMARY KEY, 
    EmployeeID INT,
    ShipName VARCHAR(100),
    ShipAddress TEXT,
    ShipCity VARCHAR(100),
    ShipRegion VARCHAR(100),
    ShipPostalCode INT,
    ShipCountry VARCHAR(100),
    ShipVia VARCHAR(100),
    OrderDate DATE NOT NULL,
    RequiredDate DATE,
    ShippedDate DATE CHECK (ShippedDate > OrderDate OR ShippedDate IS NULL),
    CustomerID INT REFERENCES tblCustomers(CustomerID),
    Freight REAL
);

Select * from tblOrders;

INSERT INTO tblOrders (EmployeeID, ShipName, ShipAddress, ShipCity, ShipRegion, ShipPostalCode, ShipCountry, ShipVia, OrderDate, RequiredDate, ShippedDate, CustomerID, Freight) VALUES
(1, 'John Doe', '123 Maple St', 'Toronto', 'Ontario', 12345, 'Canada', 'DTDC', '2024-09-01', '2024-09-10', '2024-09-05', 101, 15.75),
(2, 'Jane Smith', '456 Oak St', 'Vancouver', 'British Columbia', 67890, 'Canada', 'DHL', '2024-09-02', '2024-09-12', NULL, 102, 25.50),
(3, 'Alice Johnson', '789 Pine Rd', 'Montreal', 'Quebec', 54321, 'Canada', 'ECOM', '2024-09-03', '2024-09-15', '2024-09-10', 103, 10.00),
(4, 'Bob Brown', '321 Birch Blvd', 'Calgary', 'Alberta', 11223, 'Canada', 'USPS', '2024-09-04', '2024-09-14', '2024-09-11', 104, 30.25),
(5, 'Charlie Green', '654 Cedar Ln', 'Ottawa', 'Ontario', 33445, 'Canada', 'Amazon Logistics', '2024-09-05', '2024-09-20', NULL, 105, 12.00);


Select * from tblOrders;

-----------------------------------------------------------