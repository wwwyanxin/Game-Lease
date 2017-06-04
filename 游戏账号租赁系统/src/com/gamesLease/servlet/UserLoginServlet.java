package com.gamesLease.servlet;

import com.gamesLease.bean.User;
import com.gamesLease.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wyx11 on 2017-5-14.
 */
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");


        String name = request.getParameter("name");
        String password = request.getParameter("password");

        User user = new UserDAO().getUser(name, password);

        if (null == user) {
            request.getRequestDispatcher("login.jsp?errorMessage=账号或密码错误!").forward(request, response);
            return;
        } else {
            request.getSession().setAttribute("user", user);
            request.getRequestDispatcher("menu.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
