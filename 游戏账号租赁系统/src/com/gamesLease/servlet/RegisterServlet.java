package com.gamesLease.servlet;

import com.gamesLease.bean.User;
import com.gamesLease.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wyx11 on 2017-5-15.
 */
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        UserDAO userDAO=new UserDAO();
        User user = userDAO.getUser(name);
        if (null != user) {//数据库中已经存在此账号
            response.sendRedirect("register.jsp");
            return;
        } else {
            user=new User();
            user.setName(name);
            user.setPassword(password);
            userDAO.addUser(user);
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
