import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dunkelheit
 */
@WebServlet("/converter")
public class ConversorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String option = request.getParameter("temp_select");
        double valor = Double.parseDouble(request.getParameter("valor"));
        
        double c = ((valor - 32) * 5) / 9;
        double f =  ((valor * 9) / 5) + 32;
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if(option.equals("celsius")) {
                out.println("<h1>" + valor + " graus Celsius equivale a " + f + " graus Fahrenheit " + "</h1>");
            } else if(option.equals("fahrenheit")) {
                out.println("<h1>" + valor + " graus Fahrenheit equivale a " + c + " graus Celsius " + "</h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
