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
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        UserDAO userDAO=new UserDAO();
        User user = userDAO.getUser(name);
        if (null != user) {//数据库中已经存在此账号
            request.getRequestDispatcher("/WEB-INF/inputError.jsp?errorMessage=账号已存在!").forward(request, response);
            return;
        }else if (0 == name.trim().length() || 0 == password.trim().length()) {
            request.getRequestDispatcher("/WEB-INF/inputError.jsp?errorMessage=账号或密码不能为空").forward(request, response);
            return;
        }  else {
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
