package guestbook.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.dao.GuestbookDao;
import guestbook.vo.GuestbookVo;

public class GuestbookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // post 방식으로 전달받는 파라미터 값의 엔코딩 처리
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("a");

        if ("delete".equals(action)) {
            String password = request.getParameter("password");
            Long no = Long.parseLong(request.getParameter("no"));

            new GuestbookDao().delete(no, password);
            response.sendRedirect(request.getContextPath() + "/gb");

        } else if (("deleteform").equals(action)) {
            // 3. view로 포워딩
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deleteform.jsp");
            rd.forward(request, response);

        } else if ("add".equals(action)) {
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String contents = request.getParameter("contents");

            GuestbookVo vo = new GuestbookVo();
            vo.setName(name);
            vo.setPassword(password);
            vo.setContents(contents);

            new GuestbookDao().insert(vo);

            // 2 redirect 응답
            response.sendRedirect(request.getContextPath() + "/gb");

        } else {
            /* default request(action) */
            // 1. 요청처리
            List<GuestbookVo> list = new GuestbookDao().findAll();
            // 2. request범위에 데이터(객체) 저장
            request.setAttribute("list", list);
            // 3. view로 포워딩
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}