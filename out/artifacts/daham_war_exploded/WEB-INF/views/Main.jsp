<%--
  Created by IntelliJ IDEA.
  User: 김원규
  Date: 2021-01-13
  Time: 오후 4:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Main</title>
    <script>
        
    </script>
</head>
<body>
    <h1>${msg}</h1>
    <br>
    <h3>List</h3>
    <br>
    <c:forEach items="${list}" var="item">
        <table border="1">
            <tr>
                <td>${item.name}</td>
                <td>${item.ip}</td>
                <td>${item.location}</td>
                <td><input type="button" id="bt_insert"></td>
            </tr>
        </table>
    </c:forEach>
    <br>
    <h3>Input</h3>
    <br>
    <form action="/input" method="post">
        <table border="1">
            <tr>
                <td>Id</td>
                <td><input type="number" name="id"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Ip</td>
                <td><input type="text" name="ip"></td>
            </tr>
            <tr>
                <td>Location</td>
                <td><input type="text" name="location"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="입력">
                    <input type="reset" value="취소">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
