package com.gamesLease.servlet;

import com.gamesLease.bean.Game;
import com.gamesLease.bean.User;
import com.gamesLease.dao.GameDAO;
import com.gamesLease.service.CreateLease;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by wyx11 on 2017-5-20.
 */
public class LeaseServlet extends HttpServlet {
    GameDAO gameDAO = new GameDAO();
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");//("yyyy-MM-dd'T'HH:mm");//("yyyy-MM-dd'T'HH:mm");

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        Integer gameId = Integer.valueOf(request.getParameter("gameId"));
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        Double price = Double.valueOf(request.getParameter("price"));
        String description = request.getParameter("description");
        if (null == account || null == password || price < 0) {
            request.getRequestDispatcher("/WEB-INF/inputError.jsp");
        }

        //Calendar类比Date更安全
        Calendar calendar=Calendar.getInstance();
        try {
            calendar.setTime(dateFormat.parse(request.getParameter("end")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date end = calendar.getTime();
        User user = (User) request.getSession().getAttribute("user");


        CreateLease createLease=new CreateLease();
        createLease.create(user.getId(),gameId,account,password,end,price,description);

        response.sendRedirect("userinfo");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Game> gameList = gameDAO.queryGame();

        request.setAttribute("gameList", gameList);
        request.getRequestDispatcher("/WEB-INF/leaseForm.jsp").forward(request, response);
    }
}
