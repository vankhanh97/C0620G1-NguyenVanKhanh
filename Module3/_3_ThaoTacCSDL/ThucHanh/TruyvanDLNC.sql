select productCode, productName, buyprice, quantityInStock from products
where buyprice > 56.76 and quantityInStock > 10;

SELECT productCode,productName, buyprice, textDescription
FROM products
INNER JOIN productlines
ON products.productline = productlines.productline
WHERE buyprice > 56.76 AND buyprice < 95.59;

select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast';

select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers LEFT JOIN orders
on customers.customerNumber = orders.customerNumber
where orderNumber is null