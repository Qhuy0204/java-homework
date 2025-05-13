package com.example.temperature;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TemperatureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tempStr = request.getParameter("temperature");
        String type = request.getParameter("type");

        double input = Double.parseDouble(tempStr);
        double result = 0;
        String message = "";

        if ("CtoF".equals(type)) {
            result = input * 9 / 5 + 32;
            message = input + "°C = " + result + "°F";
        } else if ("FtoC".equals(type)) {
            result = (input - 32) * 5 / 9;
            message = input + "°F = " + result + "°C";
        }

        request.setAttribute("result", message);
        request.getRequestDispatcher("temp.jsp").forward(request, response);
    }
}
