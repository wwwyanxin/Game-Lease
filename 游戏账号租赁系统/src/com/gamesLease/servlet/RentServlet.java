package com.gamesLease.servlet;

import com.gamesLease.bean.User;
import com.gamesLease.dao.UserDAO;
import com.gamesLease.service.CreateOrderItem;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wyx11 on 2017-5-27.
 */
public class RentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("user");
        if (null == user) {
            response.sendRedirect("login.jsp");
            return;
        }

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");//("yyyy-MM-dd'T'HH:mm");//("yyyy-MM-dd'T'HH:mm");

        Integer leaseId= Integer.valueOf(request.getParameter("leaseId"));
        Double spend = Double.valueOf(request.getParameter("spendMoney"));
        Date end=null;
        try {
            end=dateFormat.parse(request.getParameter("end"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        new CreateOrderItem().create(user,leaseId,end,spend);

        user.setBalance(new UserDAO().getUserById(user.getId()).getBalance());//重新设置balance
        response.sendRedirect("menu.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
