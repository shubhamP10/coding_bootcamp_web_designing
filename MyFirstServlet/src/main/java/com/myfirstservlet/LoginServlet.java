package com.myfirstservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description = "Login Servlet Testing",
        urlPatterns = {"/LoginServlet"},
        initParams = {
                @WebInitParam(name = "username", value = "Shubham"),
                @WebInitParam(name = "password", value = "alliswell")
        }
)

public class LoginServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String user = req.getParameter("uName");
                String pass = req.getParameter("uPass");
                String userID = getServletConfig().getInitParameter("username");
                String password = getServletConfig().getInitParameter("password");
                if (userID.equals(user) && password.equals(pass))
                {
                        req.setAttribute("user", user);
                        req.getRequestDispatcher("LoginSuccess.jsp").forward(req,resp);
                }
                else
                {
                        RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
                        PrintWriter out = resp.getWriter();
                        out.print("<font color='red'> Either Username or Password is Invalid!!! </font>");
                        rd.include(req,resp);
                }

        }
}
