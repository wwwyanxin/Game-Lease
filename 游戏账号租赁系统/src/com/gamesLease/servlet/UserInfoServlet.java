package com.gamesLease.servlet;

import com.gamesLease.bean.*;
import com.gamesLease.service.UserInfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by wyx11 on 2017-5-19.
 */
public class UserInfoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("user");
        if (null == user) {
            response.sendRedirect("login.jsp");
        }

            List<Map<String,Object>> leaseMapList=new UserInfoService().getLeaseMapList(user);
            List<Map<String,Object>> rentMapList=new UserInfoService().getRentMapList(user);

            request.setAttribute("leaseMapList",leaseMapList);
            request.setAttribute("rentMapList",rentMapList);
            request.getRequestDispatcher("/WEB-INF/userInfo.jsp").forward(request, response);
    }
}
