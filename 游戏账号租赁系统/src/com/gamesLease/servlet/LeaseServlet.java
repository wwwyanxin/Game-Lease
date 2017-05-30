package com.gamesLease.servlet;

import com.gamesLease.bean.AccountInfo;
import com.gamesLease.bean.Game;
import com.gamesLease.bean.LeaseOrder;
import com.gamesLease.bean.User;
import com.gamesLease.dao.AccountInfoDAO;
import com.gamesLease.dao.GameDAO;
import com.gamesLease.dao.LeaseOrderDAO;
import com.gamesLease.service.CreateLeaseService;

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
    private GameDAO gameDAO = new GameDAO();
    private AccountInfoDAO accountInfoDAO = new AccountInfoDAO();
    private LeaseOrderDAO leaseOrderDAO=new LeaseOrderDAO();

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");//("yyyy-MM-dd'T'HH:mm");//("yyyy-MM-dd'T'HH:mm");

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            response.sendRedirect("login.jsp");
            return;
        }

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        Integer gameId = Integer.valueOf(request.getParameter("gameId"));
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        Double price = Double.valueOf(request.getParameter("price"));
        String description = request.getParameter("description");
        //Calendar类比Date更安全
        Calendar calendar = Calendar.getInstance();
        try {
            Date end = dateFormat.parse(request.getParameter("end"));
            calendar.setTime(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date end = calendar.getTime();

        if (0 == account.length() || 0 == password.length() || price < 0) {
            request.getRequestDispatcher("/WEB-INF/inputError.jsp?errorMessage=账号或密码不能为空").forward(request, response);
            return;
        } else if (null != accountInfoDAO.getAccountInfo(account)) {//如果已存在此账户
            //查找此账号的所有订单
            List<AccountInfo> accountInfoList = accountInfoDAO.queryByAccount(account);
            for (AccountInfo accountInfo : accountInfoList) {

                LeaseOrder leaseOrder = leaseOrderDAO.getLeaseOrderByAccountId(accountInfo.getId());
                //当此订单状态不是-2未通过审核,也不是-1已下架时,不能重复提交同一个账号
                if (-2 != leaseOrder.getStatus() && -1 != leaseOrder.getStatus()) {
                    request.getRequestDispatcher("/WEB-INF/inputError.jsp?errorMessage=不能重复上架").forward(request, response);
                    return;
                }
            }

        }
        CreateLeaseService createLeaseService = new CreateLeaseService();
        createLeaseService.create(user.getId(), gameId, account, password, end, price, description);

        response.sendRedirect("userinfo");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            response.sendRedirect("login.jsp");
            return;
        }


        List<Game> gameList = gameDAO.queryGame();

        request.setAttribute("gameList", gameList);
        request.getRequestDispatcher("/WEB-INF/leaseForm.jsp").forward(request, response);
    }
}
