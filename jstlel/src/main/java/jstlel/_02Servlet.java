package jstlel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class _02Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
         * 1. 객체의 Scope(존속 범위)
         *    객체의 존재 범위
         *
         * 2. 객체가 오래 존속하는 순서
         *    Application(Context) Scope > Session Scope > Request Scope > Page Scope
         *
         * 3. EL이 이름으로 객체를 찾는 순서
         *    Application(Context) Scope < Session Scope < Request Scope < Page Scope
         *
         *    [주의] 같은 이름으로 여러 범위에 객체를 저장하는 경우 주의가 필요하다.
         */

        // request scope
        UserVo vo1 = new UserVo();
        vo1.setNo(1L);
        vo1.setName("둘리1");
        req.setAttribute("vo", vo1);

        // session scope
        UserVo vo2 = new UserVo();
        vo2.setNo(2L);
        vo2.setName("둘리2");
        req.getSession(true).setAttribute("vo", vo2);

        // application scope
        UserVo vo3 = new UserVo();
        vo3.setNo(3L);
        vo3.setName("둘리3");
        req.getServletContext().setAttribute("vo", vo3);


        req.getRequestDispatcher("/WEB-INF/views/02.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
