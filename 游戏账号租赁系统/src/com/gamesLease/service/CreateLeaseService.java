package com.gamesLease.service;

import com.gamesLease.bean.AccountInfo;
import com.gamesLease.bean.LeaseOrder;
import com.gamesLease.bean.User;
import com.gamesLease.dao.AccountInfoDAO;
import com.gamesLease.dao.GameDAO;
import com.gamesLease.dao.LeaseOrderDAO;
import com.gamesLease.dao.UserDAO;

import java.util.Date;

/**
 * Created by wyx11 on 2017-5-21.
 */
public class CreateLeaseService {
    AccountInfoDAO accountInfoDAO;
    AccountInfo accountInfo;
    LeaseOrderDAO leaseOrderDAO;
    LeaseOrder leaseOrder;
    UserDAO userDAO;

    public CreateLeaseService() {
        accountInfoDAO=new AccountInfoDAO();
        accountInfo=new AccountInfo();
        leaseOrderDAO=new LeaseOrderDAO();
        leaseOrder=new LeaseOrder();
    }

    public void create(Integer uid, Integer gameId, String account, String password, Date end, Double price, String description) {
        accountInfo.setGameId(gameId);
        accountInfo.setAccount(account);
        accountInfo.setPassword(password);
        accountInfoDAO.addAccountInfo(accountInfo);//insert account-info

        end = new java.sql.Date(end.getTime());//将util.Date转换为sql.Date
        leaseOrder.setUid(uid);
        leaseOrder.setAccountId(accountInfo.getId());
        leaseOrder.setEnd(end);
        leaseOrder.setPrice(price);
        leaseOrder.setDescription(description);
        leaseOrderDAO.addLeaseOrder(leaseOrder);
    }
}
