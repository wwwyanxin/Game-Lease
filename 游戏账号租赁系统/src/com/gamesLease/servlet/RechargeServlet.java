package com.gamesLease.servlet;

import com.gamesLease.bean.User;
import com.gamesLease.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wyx11 on 2017-5-21.
 */
public class RechargeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("user");
        if (null == user) {
            response.sendRedirect("login.jsp");
        }

        String platform = request.getParameter("platform");
        Double amount = Double.valueOf(request.getParameter("amount"));
        if (amount <= 0) {
            response.sendRedirect("/WEB-INF/inputError.jsp");
        }

        UserDAO userDAO=new UserDAO();
        user.setBalance(user.getBalance() + amount);
        userDAO.updateUser(user);

        response.sendRedirect("userinfo");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/gamesLease/recharge.jsp");
    }
}
