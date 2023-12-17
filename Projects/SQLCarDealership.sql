CREATE TABLE vehicles(
vin INT NOT NULL,
year INT NOT NULL,
make VARCHAR(40) NOT NULL,
model VARCHAR(40) NOT NULL,
vehicleType VARCHAR(30) NOT NULL,
color VARCHAR(20) NOT NULL,
price FLOAT(20,2) NOT NULL,
odometer INT NOT NULL,
Sold BIT(1)
);

CREATE TABLE dealerships(
DealershipID INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(60) NOT NULL,
address VARCHAR (80) NOT NULL,
phone VARCHAR (12)
);

CREATE TABLE inventories(
DealershipID INT,
vin INT,
FOREIGN KEY(DealershipID) REFERENCES dealerships(DealershipID),
FOREIGN KEY (vin) REFERENCES vehicles(vin)
);

CREATE TABLE salescontracts(
SalesID INT AUTO_INCREMENT PRIMARY KEY,
date DATETIME,
customerName VARCHAR(150),
customerEmail VARCHAR(200),
vin INT,
totalPrice FLOAT(10,2) NOT NULL,
monthlyPayment FLOAT(10,2) NOT NULL,
salesTax FLOAT(10,2) NOT NULL,
recordingFee FLOAT(10,2) NOT NULL,
financing BIT(1) NOT NULL,
processingFee FLOAT(10,2) NOT NULL,
FOREIGN KEY(date) REFERENCES contracts(date),
FOREIGN KEY(vin) REFERENCES vehicles(vin),
FOREIGN KEY(customerName) REFERENCES contracts(customerName),
FOREIGN KEY(customerEmail) REFERENCES contracts(customerEmail)
);

CREATE TABLE leasecontracts(
LeaseID INT AUTO_INCREMENT PRIMARY KEY,
date DATETIME,
customerName VARCHAR(150),
customerEmail VARCHAR(200),
vin INT,
expectedEndingValue float(10,2) NOT NULL,
leaseFee FLOAT(10,2) NOT NULL,
totalPrice FLOAT(20,2) NOT NULL,
monthlyPayment FLOAT(10,2) NOT NULL,

FOREIGN KEY(date) REFERENCES contracts(date),
FOREIGN KEY(vin) REFERENCES vehicles(vin)
);


INSERT INTO vehicles(vin, year, make, model, vehicleType,color,odometer,price,sold)
VALUES(10112,2023,'Ford','Mustang','Coupe','Bue',12,24500.00,1),
(10113, 2020,'Dodge','Charger','Sedan','Red',82000,22500.00,1),
(10114, 2018,'Honda','Civic','Sedan','White',45608,18200.50,1);
(10115, 2012, 'Chevrolet', 'Silverado', 'Truck', 'Red', 145000, 15500.00, 1),
(10116, 2023, 'Mazda', 'Miata', 'Coupe', 'Carbon Grey', 2, 35000.00, 1)

INSERT INTO dealerships(name,address,phone)
VALUES('Veslesnic Auto Company','123 Rainbow RD','816-111-2342'),
('Luxury Autos', '12132 Greenville Ave', ,'214-223-1233'),
('Cars 4 Us', '1212 Lovers Ln', '4695601983');


INSERT INTO inventories(DealershipID,vin)
VALUES(1,12131),
(2,12214),
(3,12112);

INSERT INTO salescontracts(date,customerName,customerEmail,vin,totalPrice,monthlyPayment,salesTax,recordingFee,financing,processingFee)
VALUES(NOW(),'Maria Rodriguez','mrodri232@gmail.com',10121,12500.55, 250.50, 250, 100, 0, 250.00),
(NOW(),'Jose Hernandez', 'hrdz@yahoo.com', 10122, 15000.00, 425.00, 150.00, 100.00, 0, 200.00),
(NOW(),'Adriana Lima','adrianalimabean@icloud.com',11211,12422.67,150.00,100.00,150.00,0,50.50); 



SELECT *
FROM dealerships;


SELECT dealerships.name, vehicles.*
FROM vehicles
JOIN inventories ON vehicles.vin = inventories.vin
JOIN dealerships ON inventories.DealershipID = dealerships.DealershipID
WHERE dealerships.DealershipID = '';


SELECT *
FROM vehicles
WHERE VIN = '';


SELECT dealerships.name, vehicles.*
FROM dealerships
JOIN inventories ON inventories.DealershipID = dealerships.DealershipID
JOIN vehicles ON vehicles.vin = inventories.vin
WHERE inventories.vin = '';


SELECT dealerships.name AS DealershipName
FROM dealerships
JOIN inventories ON inventories.DealershipID = dealerships.DealershipID
JOIN vehicles ON vehicles.vin = inventories.vin
WHERE vehicles.make = ''
GROUP BY dealerships.name;


SELECT dealerships.name, salescontracts.*
FROM salescontracts
JOIN vehicles ON vehicles.vin = salescontracts.vin
JOIN inventories ON inventories.vin	= salescontracts.vin
JOIN dealerships ON inventories.DealershipID = dealerships.DealershipID
WHERE YEAR (salescontracts.date) = '' AND dealerships.DealershipID = '';