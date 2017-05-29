package com.gamesLease.servlet;

import com.gamesLease.bean.Game;
import com.gamesLease.bean.User;
import com.gamesLease.dao.GameDAO;
import com.gamesLease.service.LeaseOrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by wyx11 on 2017-5-25.
 */
public class RentListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("user");
        if (null == user) {
            response.sendRedirect("login.jsp");
            return;
        }

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String gameId = request.getParameter("game");
        String description = request.getParameter("description");

        List<Map<String, Object>> leaseMapList = new LeaseOrderService().getLeaseInfoMapList(gameId,description,1);//获得可租用的出租信息
        List<Game> gameList = new GameDAO().queryGame();

        request.setAttribute("leaseMapList", leaseMapList);
        request.setAttribute("gameList", gameList);
        request.getRequestDispatcher("/WEB-INF/leaseList.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("user");
        if (null == user) {
            response.sendRedirect("login.jsp");
            return;
        }


        List<Map<String, Object>> leaseMapList = new LeaseOrderService().getLeaseInfoMapList(1);//获得可租用的出租信息
        List<Game> gameList = new GameDAO().queryGame();

        request.setAttribute("leaseMapList", leaseMapList);
        request.setAttribute("gameList", gameList);
        request.getRequestDispatcher("/WEB-INF/leaseList.jsp").forward(request, response);
    }
}
