package com.gamesLease.servlet;


import com.gamesLease.bean.Admin;
import com.gamesLease.bean.LeaseOrder;
import com.gamesLease.dao.LeaseOrderDAO;
import com.gamesLease.service.LeaseOrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * Created by wyx11 on 2017-5-24.
 */
public class AdminAuditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        if (null == admin) {
            response.sendRedirect("adminLogin.jsp");
        }

        LeaseOrderDAO leaseOrderDAO=new LeaseOrderDAO();
        LeaseOrder leaseOrder=null;

        Enumeration parameterNames = request.getParameterNames();//获得所有的参数名
       // String[] values = request.getParameterValues("name");
        while (parameterNames.hasMoreElements()) {
            String paramName= (String) parameterNames.nextElement();
            if (paramName.startsWith("audit_")) {//如果参数名以audit_开头
                Integer leaseId = Integer.valueOf(paramName.substring(6));//从第7位截取leaseId
                String paramValue = request.getParameter(paramName);//获得此参数的值
                Integer status=null;
                if (paramValue.equals("pass")) {
                    status = 1;//通过审核
                } else {
                    status=-2;//未通过审核
                }
                leaseOrder = leaseOrderDAO.getLeaseOrderById(leaseId);//获得此出租单
                leaseOrder.setStatus(status);
                leaseOrderDAO.updateLeaseOrder(leaseOrder);
            }
        }
        request.getRequestDispatcher("/WEB-INF/adminMenu.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        if (null == admin) {
            response.sendRedirect("adminLogin.jsp");
        }

        List<Map<String, Object>> leaseMapList = new LeaseOrderService().getLeaseInfoMapList(0);//0是未审核的出租单
        request.setAttribute("leaseMapList",leaseMapList);
        request.getRequestDispatcher("/WEB-INF/adminAudit.jsp").forward(request, response);
    }
}
