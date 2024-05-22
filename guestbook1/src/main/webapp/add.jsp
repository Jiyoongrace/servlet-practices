<%@ page import="guestbook.vo.GuestbookVo" %>
<%@ page import="guestbook.dao.GuestbookDao" %>
<%@ page import="guestbook.dao.GuestbookDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");

    String name = request.getParameter("name");
    String password = request.getParameter("password");
    String contents = request.getParameter("contents");

    GuestbookVo vo = new GuestbookVo();
    vo.setName(name);
    vo.setPassword(password);
    vo.setContents(contents);

    new GuestbookDao().insert(vo);

    response.sendRedirect(request.getContextPath());
%>