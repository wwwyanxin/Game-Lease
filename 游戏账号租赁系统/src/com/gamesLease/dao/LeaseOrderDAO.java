package com.gamesLease.dao;

import com.gamesLease.bean.LeaseOrder;
import com.gamesLease.db.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyx11 on 2017-5-16.
 */
public class LeaseOrderDAO {
    public LeaseOrder getLeaseOrderByAccountId(Integer AccountId) {
        LeaseOrder result=null;
        try {
            Connection conn = new DBUtil().getConncetion();
            String sql = "" +
                    "select * from lease_order where account_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, AccountId);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new LeaseOrder();
                result.setId(rs.getInt("id"));
                result.setAccountId(rs.getInt("account_id"));
                result.setStart(rs.getDate("start"));
                result.setEnd(rs.getDate("end"));
                result.setPrice(rs.getDouble("price"));
                result.setStatus(rs.getInt("status"));
                result.setDescription(rs.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean addLeaseOrder(LeaseOrder leaseOrder) {
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    "insert into lease_order (account_id,end,price,description) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, leaseOrder.getAccountId());
            ps.setDate(2, (Date)leaseOrder.getEnd());
            ps.setDouble(3, leaseOrder.getPrice());
            ps.setString(4,leaseOrder.getDescription());

            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                leaseOrder.setId(rs.getInt("id"));
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean updateLeaseOrder(LeaseOrder leaseOrder) {
        try {
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    "update lease_order " +
                    "set end=?,price=?,status=?,description=? " +
                    "where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) leaseOrder.getEnd());
            ps.setDouble(2, leaseOrder.getPrice());
            ps.setInt(3, leaseOrder.getStatus());
            ps.setString(4, leaseOrder.getDescription());
            ps.setInt(5,leaseOrder.getId());

            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<LeaseOrder> queryLeaseOrder() {
        List<LeaseOrder> result=null;
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    "select * from lease_order ";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs=ps.executeQuery();
            result=new ArrayList<>();
            LeaseOrder leaseOrder=null;
            while (rs.next()) {
                leaseOrder=new LeaseOrder();

                leaseOrder.setId(rs.getInt("id"));
                leaseOrder.setAccountId(rs.getInt("account_id"));
                leaseOrder.setStart(rs.getDate("start"));
                leaseOrder.setEnd(rs.getDate("end"));
                leaseOrder.setStatus(rs.getInt("status"));
                leaseOrder.setPrice(rs.getDouble("price"));
                leaseOrder.setDescription(rs.getString("description"));

                result.add(leaseOrder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
