package com.gamesLease.servlet;

import com.gamesLease.bean.Admin;
import com.gamesLease.bean.LeaseOrder;
import com.gamesLease.bean.User;
import com.gamesLease.dao.AdminDAO;
import com.gamesLease.dao.LeaseOrderDAO;
import com.gamesLease.dao.UserDAO;
import com.gamesLease.service.LeaseOrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by wyx11 on 2017-5-23.
 */
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Admin admin = new AdminDAO().getAdmin(name, password);
        if (null != admin) {
            request.getSession().setAttribute("admin", admin);
            //List<Map<String,Object>> leaseMapList=new LeaseOrderService().getLeaseInfoMapList();
            //request.setAttribute("leaseMapList",leaseMapList);
            request.getRequestDispatcher("/WEB-INF/adminMenu.jsp").forward(request, response);
        } else {
            response.sendRedirect("adminLogin.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        if (null != admin) {
            request.getRequestDispatcher("/WEB-INF/adminMenu.jsp").forward(request, response);
        }else {
            response.sendRedirect("adminLogin.jsp");
        }
    }
}
