package com.gamesLease.service;

import com.gamesLease.bean.*;
import com.gamesLease.dao.*;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by wyx11 on 2017-5-23.
 */
public class UserInfoService {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
    private Map<Integer,Object> status;

    public UserInfoService() {
        status = new HashMap<>();
        status.put(-2, "审核未通过");
        status.put(-1, "已下架");
        status.put(0, "审核中");
        status.put(1, "可租用");
        status.put(2, "已被租");
    }


    public List<Map<String,Object>> getLeaseMapList(User user) {
        AccountInfoDAO accountInfoDAO=new AccountInfoDAO();
        GameDAO gameDAO=new GameDAO();
        LeaseOrderDAO leaseOrderDAO=new LeaseOrderDAO();//获得出租表单

        List<LeaseOrder> leaseOrderList = leaseOrderDAO.queryLeaseOrderByUid(user.getId());

        List<Map<String,Object>> leaseMapList=new ArrayList<>();//出租单


        if(null!=leaseOrderList) {
            for (LeaseOrder leaseOrder : leaseOrderList) {
                Map<String, Object> leaseMap = new HashMap<>();
                AccountInfo accountInfo = accountInfoDAO.getAccountInfoById(leaseOrder.getAccountId());
                Game game = gameDAO.getGameById(accountInfo.getGameId());

                String start = dateFormat.format(leaseOrder.getStart());
                String end = dateFormat.format(leaseOrder.getEnd());


                leaseMap.put("game", game.getName());
                leaseMap.put("account", accountInfo.getAccount());
                leaseMap.put("password", accountInfo.getPassword());
                leaseMap.put("start", start);
                leaseMap.put("end", end);
                leaseMap.put("price", leaseOrder.getPrice());
                leaseMap.put("status", status.get(leaseOrder.getStatus()));
                leaseMap.put("description", leaseOrder.getDescription());

                leaseMapList.add(leaseMap);
            }
        }
        return leaseMapList;
    }

    public List<Map<String, Object>> getRentMapList(User user) {
        AccountInfoDAO accountInfoDAO=new AccountInfoDAO();
        GameDAO gameDAO=new GameDAO();
        UserDAO userDAO=new UserDAO();
        LeaseOrderDAO leaseOrderDAO=new LeaseOrderDAO();//获得出租表单DAO
        OrderItemDAO orderItemDAO=new OrderItemDAO();//获得租入表单DAO

        List<OrderItem> orderItemList = orderItemDAO.queryOrderItemByUid(user.getId());

        List<Map<String, Object>> rentMapList = new ArrayList<>();//租赁单

        if(null!=orderItemList) {
            for (OrderItem orderItem : orderItemList) {
                Map<String, Object> rentMap = new HashMap<>();

                LeaseOrder leaseOrder = leaseOrderDAO.getLeaseOrderById(orderItem.getLeaseId());
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

        return rentMapList;
    }
}
