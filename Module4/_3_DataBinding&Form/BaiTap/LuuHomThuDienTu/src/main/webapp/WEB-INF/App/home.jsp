<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>App</title>
</head>
<body>
<h2>Settings </h2>
<form action="/home">
    <b>Language:</b><select name="language">
    <%--    <c:if test="${mailSetting.language=='English'}">--%>
    <option value="English">English</option>
    <%--    </c:if>--%>
    <option value="Vietnamese">Vietnamese</option>
    <option value="Japanese">Japanese</option>
    <option value="Chinese">Chinese</option>
</select><br><br>
    <b>Page size: </b><label> Show </label>
    <select name="page_size">
        <option value="5">5</option>
        <option value="10">10</option>
        <option value="15">15</option>
        <option value="20">20</option>
        <option value="25">25</option>
    </select>
    <label>emails per page</label><br><br>
    <b>Spam filter: </b><input type="checkbox" name="spam" value="1">
    <c:if test="${mailSetting.spam=='1'}">
        <input name="spam" type="checkbox" checked>
    </c:if>
    <c:if test="${mailSetting.spam=='0'}">
        <input name="spam" type="checkbox" >
    </c:if>
    <label>Enable spams filter</label><br><br>
    <b>Signature:</b>
    <textarea name="signature">${mailSetting.signature}</textarea>
    <input type="submit" value="Update">
</form>

</body>
</html>
