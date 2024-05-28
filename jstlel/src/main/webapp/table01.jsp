<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String row = request.getParameter("r");
    String col = request.getParameter("c");

    int nRow = Integer.parseInt(row);
    int nCol = Integer.parseInt(col);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" cellspacing="0" cellpadding="5">
        <%
            for(int i = 0; i < nRow; i++) {
        %>
        <tr>
            <%
                for(int j = 0; j < nCol; j++) {
            %>
                <td>Cell(<%=i %>, (<%=j %>)</td>
            <%
                }
            %>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
