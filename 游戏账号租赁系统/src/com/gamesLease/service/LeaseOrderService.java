package com.gamesLease.service;

import com.gamesLease.bean.AccountInfo;
import com.gamesLease.bean.Game;
import com.gamesLease.bean.LeaseOrder;
import com.gamesLease.bean.User;
import com.gamesLease.dao.AccountInfoDAO;
import com.gamesLease.dao.GameDAO;
import com.gamesLease.dao.LeaseOrderDAO;
import com.gamesLease.dao.UserDAO;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by wyx11 on 2017-5-23.
 */
public class LeaseOrderService {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
    private Map<Integer,Object> status;

    public LeaseOrderService() {
        status = new HashMap<>();
        status.put(-2, "审核未通过");
        status.put(-1, "已下架");
        status.put(0, "审核中");
        status.put(1, "可租用");
        status.put(2, "已被租");
    }

    public List<Map<String, Object>> getLeaseInfoMapList() {
        List<Map<String, Object>> leaseInfoMapList=null;

        AccountInfoDAO accountInfoDAO=new AccountInfoDAO();
        GameDAO gameDAO=new GameDAO();
        LeaseOrderDAO leaseOrderDAO=new LeaseOrderDAO();
        UserDAO userDAO=new UserDAO();

        List<LeaseOrder> leaseOrderList=leaseOrderDAO.queryLeaseOrder();
        leaseInfoMapList=new ArrayList<>();
        Iterator iterator=leaseOrderList.iterator();
        LeaseOrder leaseOrder=null;
        while (iterator.hasNext()) {
            leaseOrder= (LeaseOrder) iterator.next();

            Map<String, Object> leaseMap = new HashMap<>();
            User user = userDAO.getUserById(leaseOrder.getUid());
            AccountInfo accountInfo = accountInfoDAO.getAccountInfoById(leaseOrder.getAccountId());
            Game game = gameDAO.getGameById(accountInfo.getGameId());

            String start = dateFormat.format(leaseOrder.getStart());
            String end = dateFormat.format(leaseOrder.getEnd());


            leaseMap.put("user",user.getName());
            leaseMap.put("leaseId", leaseOrder.getId());
            leaseMap.put("game", game.getName());
            leaseMap.put("account", accountInfo.getAccount());
            leaseMap.put("password", accountInfo.getPassword());
            leaseMap.put("start", start);
            leaseMap.put("end", end);
            leaseMap.put("price", leaseOrder.getPrice());
            leaseMap.put("status", status.get(leaseOrder.getStatus()));
            leaseMap.put("description", leaseOrder.getDescription());

            leaseInfoMapList.add(leaseMap);
        }
        return leaseInfoMapList;
    }

    public List<Map<String, Object>> getLeaseInfoMapList(Integer sta) {
        List<Map<String, Object>> leaseInfoMapList=null;

        AccountInfoDAO accountInfoDAO=new AccountInfoDAO();
        GameDAO gameDAO=new GameDAO();
        LeaseOrderDAO leaseOrderDAO=new LeaseOrderDAO();
        UserDAO userDAO=new UserDAO();

        List<LeaseOrder> leaseOrderList=leaseOrderDAO.queryLeaseOrderByStatus(sta);
        leaseInfoMapList=new ArrayList<>();
        Iterator iterator=leaseOrderList.iterator();
        LeaseOrder leaseOrder=null;
        while (iterator.hasNext()) {
            leaseOrder= (LeaseOrder) iterator.next();

            Map<String, Object> leaseMap = new HashMap<>();
            User user = userDAO.getUserById(leaseOrder.getUid());
            AccountInfo accountInfo = accountInfoDAO.getAccountInfoById(leaseOrder.getAccountId());
            Game game = gameDAO.getGameById(accountInfo.getGameId());

            String start = dateFormat.format(leaseOrder.getStart());
            String end = dateFormat.format(leaseOrder.getEnd());


            leaseMap.put("user",user.getName());
            leaseMap.put("leaseId", leaseOrder.getId());
            leaseMap.put("game", game.getName());
            leaseMap.put("account", accountInfo.getAccount());
            leaseMap.put("password", accountInfo.getPassword());
            leaseMap.put("start", start);
            leaseMap.put("end", end);
            leaseMap.put("price", leaseOrder.getPrice());
            leaseMap.put("status", status.get(leaseOrder.getStatus()));
            leaseMap.put("description", leaseOrder.getDescription());

            leaseInfoMapList.add(leaseMap);
        }
        return leaseInfoMapList;
    }
}
