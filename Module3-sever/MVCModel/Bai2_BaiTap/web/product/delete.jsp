<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name Product:</td>
                <td>${requestScope["product"].getNameProduct()}</td>
            </tr>
            <tr>
                <td>Cost:</td>
                <td>${requestScope["product"].getCost()}</td>
            </tr>
            <tr>
                <td>Product Description:</td>
                <td>${requestScope["product"].getProductDescription()}</td>
            </tr>
            <tr>
                <td>Manufacturer:</td>
                <td>${requestScope["product"].getManufacturer()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>