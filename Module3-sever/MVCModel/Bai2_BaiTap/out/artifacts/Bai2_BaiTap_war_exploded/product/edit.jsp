<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name Product: </td>
                <td><input type="text" name="nameProduct" id="nameProduct" value="${requestScope["product"].getNameProduct()}"></td>
            </tr>
            <tr>
                <td>Cost: </td>
                <td><input type="text" name="cost" id="cost" value="${requestScope["product"].getCost()}"></td>
            </tr>
            <tr>
                <td>Product Description: </td>
                <td><input type="text" name="productDescription" id="productDescription" value="${requestScope["product"].getProductDescription()}"></td>
            </tr>
            <tr>
                <td>Manufacturer: </td>
                <td><input type="text" name="manufacturer" id="manufacturer" value="${requestScope["product"].getManufacturer()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>