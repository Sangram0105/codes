import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Calculate")
public class MyProj extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MyProj() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String n1Str = request.getParameter("n1");
        String n2Str = request.getParameter("n2");

        if (n1Str != null && n2Str != null && !n1Str.isEmpty() && !n2Str.isEmpty()) {
            int num1 = Integer.parseInt(n1Str);
            int num2 = Integer.parseInt(n2Str);
         double ans;

          
            if (request.getParameter("add") != null) {
                ans = num1 + num2;
                pw.println("Addition Result: " + ans);
            } else if (request.getParameter("sub") != null) {
                ans = num1 - num2;
                pw.println("Subtraction Result: " + ans);
            } else if (request.getParameter("mul") != null) {
                ans = num1 * num2;
                pw.println("Multiplication Result: " + ans);
            } else if (request.getParameter("div") != null) {
                if (num2 != 0) {
                    ans = num1 / num2;
                    pw.println("Division Result: " + ans);
                } else {
                    pw.println("Cannot divide by zero.");
                }
            }
        } else {
            pw.println("Please enter valid numbers.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}