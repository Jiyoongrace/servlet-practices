package helloweb;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int visitCount = 0;

        // Read the cookie
        Cookie[] cookies = req.getCookies();
        if(cookies != null && cookies.length > 0) {
            for(Cookie cookie : cookies) {
                if("visitCount".equals(cookie.getName())) {
                    visitCount = Integer.parseInt(cookie.getValue());
                }
            }
        }
        visitCount++;

        // Write the cookie
        Cookie cookie = new Cookie("visitCount", String.valueOf(visitCount));
        cookie.setPath(req.getContextPath());
        cookie.setMaxAge(24 * 60 * 60); // 1 day
        resp.addCookie(cookie);

        // Print the cookie
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().print("<h1>방문횟수: " + visitCount + "</h1>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
