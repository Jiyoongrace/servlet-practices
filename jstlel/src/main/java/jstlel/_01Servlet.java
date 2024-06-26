package jstlel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class _01Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 값
        int iVal = 10;
        long lVal = 10;
        float fVal = 3.14f;
        boolean bVal = true;
        String sVal = "hello";

        // 객체
        Object obj = null;
        UserVo vo = new UserVo();
        vo.setNo(10L);
        vo.setName("둘리");

        req.setAttribute("obj", obj);
        req.setAttribute("vo", vo);

        req.setAttribute("ival", iVal);
        req.setAttribute("lval", lVal);
        req.setAttribute("fval", fVal);
        req.setAttribute("bval", bVal);
        req.setAttribute("sval", sVal);

        // map
        Map<String, Object> map = new HashMap<>();
        map.put("ival", iVal);
        map.put("lval", lVal);
        map.put("fval", fVal);
        map.put("bval", bVal);
        map.put("sval", sVal);
        req.setAttribute("m", map);

        req.getRequestDispatcher("/WEB-INF/views/01.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
