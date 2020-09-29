
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>Name Product</td>
        <td>Cost</td>
        <td>Product Description</td>
        <td>Manufacturer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&nameProduct=${product.getNameProduct()}">${product.getNameProduct()}</a></td>
            <td>${product.getCost()}</td>
            <td>${product.getProductDescription()}</td>
            <td>${product.getManufacturer()}</td>
            <td><a href="/products?action=edit&nameProduct=${product.getNameProduct()}">edit</a></td>
            <td><a href="/products?action=delete&nameProduct=${product.getNameProduct()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
