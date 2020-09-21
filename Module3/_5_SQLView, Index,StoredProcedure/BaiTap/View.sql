drop database if exists product;

create database product;

use product;

create table products(
id int primary key,
product_code int,
product_name varchar(50) null,
product_price int,
product_amount int,
product_description varchar(50),
product_status varchar(50));

insert into products 
values (1,1,'A',1,1,'aaa','available'),
(2,2,'B',2,2,'bbb','available'),
(3,3,'C',3,3,'ccc','available'),
(4,4,'D',4,4,'ddd','available'),
(5,5,'E',5,5,'eee','available');

create index index_product_code
on products (product_code);

select *
from products
where product_code = 5;

create index index_product_code_and_product_price
on products (product_code,product_price);
drop view if exists view_products;
create view view_products
as 
select id, product_code,product_name,product_price,product_status
from products;

select * 
from view_products;
delete from view_products
where product_name = 'B' ;

DELIMITER //

CREATE PROCEDURE findAllproduct_name()

BEGIN

  SELECT * FROM products;

END //

DELIMITER ;

call findAllproduct_name();