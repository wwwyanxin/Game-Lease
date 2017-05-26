package com.gamesLease.servlet;

import com.gamesLease.service.LeaseOrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by wyx11 on 2017-5-26.
 */
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer leaseId=Integer.valueOf(request.getParameter("leaseId"));
        Map<String, Object> leaseMap = new LeaseOrderService().getLeaseInfoMap(leaseId);
        request.setAttribute("leaseMap",leaseMap);

        request.getRequestDispatcher("/WEB-INF/cart.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
