CREATE TABLE IF NOT EXISTS category (
    id		       INT          PRIMARY KEY  AUTO_INCREMENT,
    description    VARCHAR(20)  UNIQUE       NOT NULL
);
CREATE TABLE IF NOT EXISTS product (
    id		       INT          PRIMARY KEY  AUTO_INCREMENT,
    id_category    INT          NOT NULL,
    product_name   VARCHAR(30)  UNIQUE       NOT NULL,
    weight		   VARCHAR(20),
    cost		   VARCHAR(20)  
);
CREATE TABLE IF NOT EXISTS customer (
    id		       INT          PRIMARY KEY  AUTO_INCREMENT,
	name           VARCHAR(15)  NOT NULL,
    phoneNumber	   VARCHAR(20)  UNIQUE 
);
CREATE TABLE IF NOT EXISTS employee (
    id		       INT          PRIMARY KEY  AUTO_INCREMENT,
	name           VARCHAR(20)  NOT NULL
);
CREATE TABLE IF NOT EXISTS sales (
    id		        INT          PRIMARY KEY  AUTO_INCREMENT,
    id_customer     INT,
    id_employee     INT,
	id_product      INT,
    quantity	    INT,
    date_of_pay     TIMESTAMP   
);
