package com.gamesLease.servlet;

import com.gamesLease.bean.*;
import com.gamesLease.dao.*;
import com.gamesLease.service.StatusEnum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by wyx11 on 2017-5-19.
 */
public class UserInfoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("user");
        if (null != user) {
            LeaseOrderDAO leaseOrderDAO=new LeaseOrderDAO();//获得出租表单
            List<LeaseOrder> leaseOrderList = leaseOrderDAO.queryLeaseOrderByUid(user.getId());

            OrderItemDAO orderItemDAO=new OrderItemDAO();//获得租入表单
            List<OrderItem> orderItemList = orderItemDAO.queryOrderItemByUid(user.getId());

/*            //遍历lease查找所对应的account
            List<AccountInfo> accountInfoList = new ArrayList<>();
            AccountInfoDAO accountInfoDAO=new AccountInfoDAO();
            AccountInfo accountInfo=null;
            for (LeaseOrder leaseOrder : leaseOrderList) {
                accountInfo = accountInfoDAO.getAccountInfoById(leaseOrder.getAccountId());
                accountInfoList.add(accountInfo);
            }

            //遍历account查找所对应的game
            List<Game> gameList = new ArrayList<>();
            GameDAO gameDAO=new GameDAO();
            Game game=null;
            for (AccountInfo account : accountInfoList) {
                game = gameDAO.getGameById(account.getGameId());
                gameList.add(game);
            }*/


            List<Map<String,Object>> leaseMapList=new ArrayList<>();//出租单
            List<Map<String, Object>> rentMapList = new ArrayList<>();//租赁单
            AccountInfoDAO accountInfoDAO=new AccountInfoDAO();
            GameDAO gameDAO=new GameDAO();
            UserDAO userDAO=new UserDAO();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
            if(null!=leaseOrderList) {
                for (LeaseOrder leaseOrder : leaseOrderList) {
                    Map<String, Object> leaseMap = new HashMap<>();
                    AccountInfo accountInfo = accountInfoDAO.getAccountInfoById(leaseOrder.getAccountId());
                    Game game = gameDAO.getGameById(accountInfo.getGameId());

                    String start = dateFormat.format(leaseOrder.getStart());
                    String end = dateFormat.format(leaseOrder.getEnd());

                    Enumeration statusParams=this.getServletContext().getInitParameterNames();//获得初始化参数的名字
                    String statusName=null;
                    while (statusParams.hasMoreElements()) {
                        statusName= (String) statusParams.nextElement();//遍历名字
                        Integer statusValue = Integer.valueOf(getServletContext().getInitParameter(statusName));//得到这个名字所等于的值
                        if (statusValue == leaseOrder.getStatus()) {
                            break;
                        }
                    }

                    leaseMap.put("game", game.getName());
                    leaseMap.put("account", accountInfo.getAccount());
                    leaseMap.put("password", accountInfo.getPassword());
                    leaseMap.put("start", start);
                    leaseMap.put("end", end);
                    leaseMap.put("price", leaseOrder.getPrice());
                    leaseMap.put("status", statusName);
                    leaseMap.put("description", leaseOrder.getDescription());

                    leaseMapList.add(leaseMap);
                }
            }
            if(null!=orderItemList) {
                for (OrderItem orderItem : orderItemList) {
                    Map<String, Object> rentMap = new HashMap<>();

                    LeaseOrder leaseOrder = leaseOrderDAO.getLeaseOrderByAccountId(orderItem.getLeaseId());
                    AccountInfo accountInfo = accountInfoDAO.getAccountInfoById(leaseOrder.getAccountId());
                    Game game = gameDAO.getGameById(accountInfo.getGameId());
                    User leaseUser = userDAO.getUserById(leaseOrder.getUid());
                    String start = dateFormat.format(orderItem.getStart());
                    String end = dateFormat.format(orderItem.getEnd());

                    rentMap.put("game", game.getName());
                    rentMap.put("account", accountInfo.getAccount());
                    rentMap.put("password", accountInfo.getPassword());
                    rentMap.put("start", start);
                    rentMap.put("end", end);
                    rentMap.put("price", leaseOrder.getPrice());
                    rentMap.put("leaseUser", leaseUser.getName());
                    rentMap.put("cost", orderItem.getCost());

                    rentMapList.add(rentMap);
                }
            }
            //response.sendRedirect("/WEB-INF/userInfo.jsp?leaseMapList="+leaseMapList+"&rentMapList="+rentMapList);
            request.setAttribute("leaseMapList",leaseMapList);
            request.setAttribute("rentMapList",rentMapList);
            request.getRequestDispatcher("/WEB-INF/userInfo.jsp").forward(request, response);
            //response.sendRedirect("/WEB-INF/userInfo.jsp");
//            response.sendRedirect("/WEB-INF/userInfo.jsp?leaseOrderList="
//                    + leaseOrderList + "&orderItemList=" + orderItemList+"&accountInfoList="+accountInfoList+"&gameList="+gameList);
        }
    }
}
