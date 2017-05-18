package com.gamesLease.dao;

import com.gamesLease.bean.OrderItem;
import com.gamesLease.db.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyx11 on 2017-5-17.
 */
public class OrderItemDAO {
    public boolean addOrderItem(OrderItem orderItem) {
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    "insert into orderitem (lease_id,uid,start,end,cost) values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, orderItem.getLeaseId());
            ps.setInt(2, orderItem.getUid());
            ps.setDate(3, (Date) orderItem.getStart());
            ps.setDate(4, (Date) orderItem.getEnd());
            ps.setDouble(5,orderItem.getCost());

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                orderItem.setId(rs.getInt("id"));
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<OrderItem> queryOrderItemByUid(Integer uid) {
        List<OrderItem> result=null;
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "select * from orderitem where uid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, uid);

            ResultSet rs=ps.executeQuery();
            result = new ArrayList<>();
            OrderItem orderItem=null;
            while (rs.next()) {
                orderItem=new OrderItem();
                orderItem.setId(rs.getInt("id"));
                orderItem.setLeaseId(rs.getInt("lease_id"));
                orderItem.setId(rs.getInt("uid"));
                orderItem.setStart(rs.getDate("start"));
                orderItem.setEnd(rs.getDate("end"));
                orderItem.setCost(rs.getDouble("cost"));

                result.add(orderItem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public OrderItem getOrderItem(Integer id) {
        OrderItem result=null;
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    "select * from where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new OrderItem();
                result.setId(rs.getInt("id"));
                result.setLeaseId(rs.getInt("lease_id"));
                result.setUid(rs.getInt("uid"));
                result.setStart(rs.getDate("start"));
                result.setEnd(rs.getDate("end"));
                result.setCost(rs.getDouble("cost"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  result;
    }
}
