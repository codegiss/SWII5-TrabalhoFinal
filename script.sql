CREATE DATABASE inventory;
USE inventory;

CREATE TABLE salesman (
	salesman_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(30),
    city VARCHAR(15),
    commission DECIMAL(5,2)
);

CREATE TABLE customer (
	customer_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    cust_name VARCHAR(30),
    city VARCHAR(15),
    grade NUMERIC(3),
    salesman_id INT,
    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
);

CREATE TABLE orders (
	ord_no INT AUTO_INCREMENT PRIMARY KEY NOT NULL, VALUE NUMERIC(5),
    purch_amt DECIMAL(8,2),
    ord_date DATE,
    customer_id INT,
    salesman_id INT,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
);

SELECT * FROM SALESMAN;