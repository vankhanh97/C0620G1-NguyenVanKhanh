drop database if exists contact;

Create database contact;
 use contact;
 
CREATE TABLE contacts (
    contact_id INT NOT NULL AUTO_INCREMENT,
    last_name VARCHAR(30) NOT NULL,
    first_name VARCHAR(25),
    birthday DATE,
    CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

drop table if exists suppliers;
CREATE TABLE suppliers (
    supplier_id INT NOT NULL AUTO_INCREMENT,
    supplier_name VARCHAR(50) NOT NULL,
    account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
    CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);
ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id;
    
    ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id,
  ADD first_name varchar(35) NULL
    AFTER last_name;