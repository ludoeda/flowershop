<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 003 03.02.21
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>all flowers</title>
</head>
<body>
    <table>
        <tr>
        <th>name</th>
        <th>price</th>
        <th>quantity</th>
        </tr>
        <c:forEach var="flower" items="${allFlowers}">
            <tr>
                <td>${flower.name}</td>
                <td>${flower.price}</td>
                <td>${flower.quantity}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
