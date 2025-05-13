package com.example.temperature;

import javax.servlet.*;

public class RequestListener implements ServletRequestListener {
    private static int requestCount = 0;

    public void requestInitialized(ServletRequestEvent sre) {
        requestCount++;
        sre.getServletContext().setAttribute("requestCount", requestCount);
    }

    public void requestDestroyed(ServletRequestEvent sre) {}
}
