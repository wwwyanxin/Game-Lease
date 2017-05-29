package com.gamesLease.servlet;

import com.gamesLease.bean.User;
import com.gamesLease.service.LeaseOrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by wyx11 on 2017-5-26.
 */
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("user");
        if (null == user) {
            response.sendRedirect("login.jsp");
            return;
        }

        Integer leaseId=Integer.valueOf(request.getParameter("leaseId"));
        Map<String, Object> leaseMap = new LeaseOrderService().getLeaseInfoMap(leaseId);
        //获取end,格式化为maxDate(将yyyy-MM-dd HH:mm:ss  变为yyyy-MM-ddTHH:mm:ss)
        String maxDate=((String)leaseMap.get("end")).replaceFirst(" ","T");
        leaseMap.put("maxDate", maxDate);
        request.setAttribute("leaseMap",leaseMap);

        request.getRequestDispatcher("/WEB-INF/cart.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
