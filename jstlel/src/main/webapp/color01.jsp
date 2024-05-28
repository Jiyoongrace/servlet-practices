<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String color = request.getParameter("color");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if("red".equals(color)) {
    %>
        <h1 style="color: #ff0000">Hello world</h1>
    <%
        } else if("blue".equals(color)) {
    %>
        <h1 style="color: #0000ff">Hello world</h1>
    <%
    } else if("green".equals(color)) {
    %>
        <h1 style="color: #00ff00">Hello world</h1>
    <%
        } else {
    %>
        <h1 style="color: #000000">Hello world</h1>
    <%
        }
    %>
</body>
</html>
