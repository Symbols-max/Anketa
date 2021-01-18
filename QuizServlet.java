import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class QuizServlet extends javax.servlet.http.HttpServlet {
    public AtomicInteger male= new AtomicInteger(0);
    public AtomicInteger female=new AtomicInteger(0);
    public AtomicInteger warm=new AtomicInteger(0);
    public AtomicInteger cold=new AtomicInteger(0);


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String gender = request.getParameter("gender");
        String weather = request.getParameter("weather");

        if(gender.equals("male")){
            male.getAndIncrement();
            request.setAttribute("male",male);
        } else { request.setAttribute("male",male);}
        if(gender.equals("female"))  {
            female.getAndIncrement();
            request.setAttribute("female",female);
        } else { request.setAttribute("female",female); }

        if(weather.equals("cold")){
            cold.getAndIncrement();
            request.setAttribute("cold",cold);
        } else { request.setAttribute("cold",cold); }
        if(weather.equals("warm")) {
            warm.getAndIncrement();
            request.setAttribute("warm",warm);
        } else { request.setAttribute("warm",warm); }

        request.getRequestDispatcher("Statistic.jsp").forward(request, response);
        response.sendRedirect("Statistic.jsp");
    }
}
