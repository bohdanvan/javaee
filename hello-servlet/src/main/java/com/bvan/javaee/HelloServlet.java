package com.bvan.javaee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author bvanchuhov
 */
public class HelloServlet extends HttpServlet {

    public static final String PARAM_NAME = "name";
    public static final String DEFAULT_NAME = "anonymous";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter(PARAM_NAME);

        if (name == null) {
            name = DEFAULT_NAME;
        }

        String helloMessage = helloMessage(name);

        PrintWriter writer = resp.getWriter();
        writer.println(helloMessage);
    }

    private String helloMessage(String name) {
        return "Hello, " + name;
    }
}
