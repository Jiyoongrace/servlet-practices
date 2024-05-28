package helloweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/lc")
public class LifeCycleServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        System.out.println("init() called");
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service(...) called");
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet(...) called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost(...) called");
        super.doGet(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("destroy(...) called");
        super.destroy();
    }
}
