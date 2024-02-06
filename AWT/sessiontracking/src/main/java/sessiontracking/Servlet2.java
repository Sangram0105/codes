// SessionTrackingServlet.java
package sessiontracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SessionTrackingServlet")
public class Servlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve or create a session
        jakarta.servlet.http.HttpSession session = request.getSession();

        // Get or create a session attribute named "counter"
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 1;
        } else {
            counter++;
        }

        // Set the updated counter value as a session attribute
        session.setAttribute("counter", counter);

        // Retrieve data from the form
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Display the counter value and user data in the response
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Session Tracking</title></head><body>");
        response.getWriter().println("<h2>Session Tracking - Counter: " + counter + "</h2>");
        response.getWriter().println("<p>Name: " + name + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("</body></html>");
    }
}
