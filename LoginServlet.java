import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.*;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    public final static Map<String, String> log = new HashMap<>();

    static {
        log.put("ggg", "111");
        log.put("rrr", "222");
        log.put("sss", "333");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (log.containsKey(login)) {
            if (password.equals(log.get(login))) {
                HttpSession session = request.getSession();
                session.setAttribute("user_login", login);
                response.sendRedirect("index.jsp");
            } else response.sendRedirect("index.jsp");
        } else response.sendRedirect("index.jsp");
    }

        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
        javax.servlet.ServletException, IOException {
            String a = request.getParameter("a");
            HttpSession session = request.getSession(false);

            if ("exit".equals(a) && (session != null))
                session.removeAttribute("user_login");

            response.sendRedirect("index.jsp");
        }
    }