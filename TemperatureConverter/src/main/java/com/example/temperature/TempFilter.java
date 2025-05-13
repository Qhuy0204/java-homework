package com.example.temperature;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TempFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String temp = request.getParameter("temperature");

        try {
            Double.parseDouble(temp);
            chain.doFilter(request, response);
        } catch (Exception e) {
            request.setAttribute("error", "Giá trị nhiệt độ không hợp lệ!");
            request.getRequestDispatcher("temp.jsp").forward(request, response);
        }
    }
}
