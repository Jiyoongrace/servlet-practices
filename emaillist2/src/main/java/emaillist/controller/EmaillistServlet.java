package emaillist.controller;

import emaillist.dao.EmaillistDao;
import emaillist.vo.EmaillistVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmaillistServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public EmaillistDao emaillistDao = new EmaillistDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String action = req.getParameter("a");
        if("".equals(action)) {

        } else if("".equals(action)) {

        } else {
            /* default action (list) */
            new EmaillistDao().findAll();
        }
    }
}
