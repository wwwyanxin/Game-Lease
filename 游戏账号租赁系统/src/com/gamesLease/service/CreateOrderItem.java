package com.gamesLease.service;

import com.gamesLease.bean.LeaseOrder;
import com.gamesLease.bean.OrderItem;
import com.gamesLease.bean.User;
import com.gamesLease.dao.LeaseOrderDAO;
import com.gamesLease.dao.OrderItemDAO;
import com.gamesLease.dao.UserDAO;

import java.util.Date;

/**
 * Created by wyx11 on 2017-5-27.
 */
public class CreateOrderItem {
    public void create(User user, Integer leaseId, Date end,Double spend) {
        UserDAO userDAO=new UserDAO();
        LeaseOrderDAO leaseOrderDAO=new LeaseOrderDAO();
        OrderItemDAO orderItemDAO=new OrderItemDAO();

        LeaseOrder leaseOrder=leaseOrderDAO.getLeaseOrderById(leaseId);//获得出租单
        OrderItem orderItem=new OrderItem();//创建一个租赁订单

        leaseOrder.setStatus(2);//设置为被租
        leaseOrderDAO.updateLeaseOrder(leaseOrder);

        //生成账单
        orderItem.setUid(user.getId());
        orderItem.setLeaseId(leaseId);
        orderItem.setEnd(end);
        orderItem.setCost(spend);
        orderItemDAO.addOrderItem(orderItem);//插入数据库
        //租赁者余额减少
        user.setBalance(user.getBalance() - spend);
        userDAO.updateUser(user);
        //出租者余额增加
        User leaseUser = userDAO.getUserById(leaseOrder.getUid());
        leaseUser.setBalance(leaseUser.getBalance() + spend);
        userDAO.updateUser(leaseUser);

    }
}
