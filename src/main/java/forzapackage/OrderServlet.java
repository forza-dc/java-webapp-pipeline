package forzapackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String menuItem = request.getParameter("menu-item");

        // For simplicity, just print the order details in the console
        System.out.println("Order received from: " + name);
        System.out.println("Email: " + email);
        System.out.println("Menu Item: " + menuItem);

        // You can add further processing, like storing order details in a database

        response.setContentType("text/html");
        response.getWriter().println("<h1>Thank you for your order, " + name + "!</h1>");
        response.getWriter().println("<p>You have ordered: " + menuItem + "</p>");
        response.getWriter().println("<p>A confirmation email will be sent to: " + email + "</p>");
    }
}
