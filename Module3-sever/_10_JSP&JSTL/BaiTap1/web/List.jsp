<%--
  Created by IntelliJ IDEA.
  User: KA
  Date: 9/28/2020
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chi</th>
        <th>Ảnh</th>
    </tr>
<c:forEach var="customer" items="${customerList}">
    <tr>
        <th>${customer.ten}</th>
        <th>${customer.ngaySinh}</th>
        <th>${customer.diaChi}</th>
        <th><img src="${customer.anh}"></th>
    </tr>
</c:forEach>
</table>
</body>
</html>
