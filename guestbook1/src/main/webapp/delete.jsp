<%@ page import="guestbook.dao.GuestbookDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");

    String sno = request.getParameter("no");
    Long no = Long.parseLong(sno);
    String password = request.getParameter("password");

    new GuestbookDao().delete(no, password);

    response.sendRedirect(request.getContextPath());
%>