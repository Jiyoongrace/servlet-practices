<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>title</title>
</head>
<body>
    <h4>값 출력</h4>
    ${ival }<br>
    ${lval }<br>
    ${fval }<br>
    ${bval }<br>
    ${sval }<br>

    <h4>객체 출력</h4>
    --${obj }-- <br>
    ${vo.no }<br>
    ${vo.name }<br>

    <h4>Map 출력</h4>
    ${m.ival }<br>
    ${m.lval }<br>
    ${m.fval }<br>
    ${m.bval }<br>
    ${m.sval }<br>

    <h4>산술 연산</h4>
    ${3*4+6/2 }<br>
    ${ival + 10 }<br>

    <h4>관계 연산</h4>
    ${ival == 10 }<br>
    ${ival < 5 }<br>
    ${obj == null }<br>
    ${empty obj }<br>
    ${obj!= null }<br>
    ${not empty obj }<br>

    <h4>논리 연산</h4>
    ${ival == 10 && ival >= 1 }<br>
    ${ival == 10 || ival <= 1 }<br>


    <if test='${ival == 10 }'>
        <h4>....</h4>
    </if>

    <h4>요청 파라미터</h4>
    --${param.no + 10 }--<br> <!-- http://localhost:8080/jstlel/01?no=20 -->
    --${param.name }--<br> <!-- http://localhost:8080/jstlel/01?no=20&name=홍길동 -->

    <h4>Context Path</h4>
    ${pageContext.request.contextPath }

</body>
</html>