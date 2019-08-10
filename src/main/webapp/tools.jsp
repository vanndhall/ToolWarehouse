
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>

<style>
    table, th, td {
        border: 1px solid black;
    }

    .red { background-color: red;}
    .green {background-color: darkgreen;}

</style>


<body>
<% session.getAttribute("action");%>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Type</th>
        <th>Available</th>
    </tr>
    <c:forEach items="${requestScope.tools}" var="tool">
        <tr>
            <td>${tool.id}</td>
            <td>${tool.name}</td>
            <td>${tool.type}</td>
            <td class ="${tool.available ? 'green' : 'red' }"></td>

        </tr>
    </c:forEach>


</table>

<br>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Type</th>
        <th>Available</th>
        <th>Status</th>
    </tr>
    <c:forEach items="${requestScope.tools}" var="tool">
        <tr>
            <td>${tool.id}</td>
            <td>${tool.name}</td>
            <td>${tool.type}</td>
            <td class ="${tool.available ? 'green' : 'red' }"></td>

            <td>
                <form method="post">
                    <input type="hidden"  name="action" value="${tool.available ? 'take' : 'return' }">
                    <input type="hidden"  name="id" value="${tool.id}">
                     <input type="submit" value="${tool.available ? 'take' : 'return' }"/>
                </form>
            </td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
