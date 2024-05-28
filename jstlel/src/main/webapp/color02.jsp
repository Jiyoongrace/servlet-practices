<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:choose>
        <c:when test="${param.color =='red'}">
            <h1 style="color: #ff0000">Hello world</h1>
        </c:when>
        <c:when test="${param.color == 'blue'}">
            <h1 style="color: #0000ff">Hello world</h1>
        </c:when>
        <c:when test="${param.color == 'green'}">
            <h1 style="color: #00ff00">Hello world</h1>
        </c:when>
        <c:otherwise>
            <h1 style="color: #000000">Hello world</h1>
        </c:otherwise>
    </c:choose>
</body>
</html>
