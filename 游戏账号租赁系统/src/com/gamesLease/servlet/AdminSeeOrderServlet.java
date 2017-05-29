package com.gamesLease.servlet;

import com.gamesLease.bean.Admin;
import com.gamesLease.service.OrderItemService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by wyx11 on 2017-5-24.
 */
public class AdminSeeOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        if (null == admin) {
            response.sendRedirect("adminLogin.jsp");
        }

        List<Map<String,Object>> orderMapList=new OrderItemService().getOrderInfoMapList();
        request.setAttribute("rentMapList",orderMapList);
        request.getRequestDispatcher("/WEB-INF/adminSeeOrder.jsp").forward(request, response);
    }
}
