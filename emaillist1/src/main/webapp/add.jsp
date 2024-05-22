<%@ page import="emaillist.vo.EmaillistVo" %>
<%@ page import="emaillist.dao.EmaillistDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");

    String firstName = request.getParameter("fn");
    String lastName = request.getParameter("ln");
    String email = request.getParameter("email");

    EmaillistVo vo = new EmaillistVo();
    vo.setFirstName(firstName);
    vo.setLastName(lastName);
    vo.setEmail(email);

    new EmaillistDao().insert(vo);

    response.sendRedirect("/emaillist1");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>이메일이 성공적으로 등록되었습니다.</h1>
</body>
</html>
