package com.gamesLease.servlet;

import com.gamesLease.service.LeaseOrderService;

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
public class AdminSeeLeaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Map<String,Object>> leaseMapList=new LeaseOrderService().getLeaseInfoMapList();
        request.setAttribute("leaseMapList",leaseMapList);
        request.getRequestDispatcher("/WEB-INF/adminSeeLease.jsp").forward(request, response);
    }
}
