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
                result.setUid(rs.getInt("uid"));
                result.setAccountId(rs.getInt("account_id"));
                result.setStart(rs.getDate("start"));
                result.setEnd(rs.getDate("end"));
                result.setPrice(rs.getDouble("price"));
                result.setStatus(rs.getInt("status"));
                result.setDescription(rs.getString("description"));
            }
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public LeaseOrder getLeaseOrderById(Integer id) {
        LeaseOrder result=null;
        try {
            Connection conn = new DBUtil().getConncetion();
            String sql = "" +
                    "select * from lease_order where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new LeaseOrder();
                result.setId(rs.getInt("id"));
                result.setUid(rs.getInt("uid"));
                result.setAccountId(rs.getInt("account_id"));
                result.setStart(rs.getDate("start"));
                result.setEnd(rs.getDate("end"));
                result.setPrice(rs.getDouble("price"));
                result.setStatus(rs.getInt("status"));
                result.setDescription(rs.getString("description"));
            }
            ps.close();
            conn.close();
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
                    "insert into lease_order (uid,account_id,end,price,description) values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1,leaseOrder.getUid());
            ps.setInt(2, leaseOrder.getAccountId());
            ps.setDate(3, (Date) leaseOrder.getEnd());
            ps.setDouble(4, leaseOrder.getPrice());
            ps.setString(5,leaseOrder.getDescription());

            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                leaseOrder.setId(rs.getInt("id"));
                return true;
            }
            ps.close();
            conn.close();
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
            ps.close();
            conn.close();
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
                leaseOrder.setUid(rs.getInt("uid"));
                leaseOrder.setAccountId(rs.getInt("account_id"));
                leaseOrder.setStart(rs.getDate("start"));
                leaseOrder.setEnd(rs.getDate("end"));
                leaseOrder.setStatus(rs.getInt("status"));
                leaseOrder.setPrice(rs.getDouble("price"));
                leaseOrder.setDescription(rs.getString("description"));

                result.add(leaseOrder);
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public List<LeaseOrder> queryLeaseOrderByUid(Integer uid) {
        List<LeaseOrder> result=null;
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    "select * from lease_order where uid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,uid);
            ResultSet rs=ps.executeQuery();
            result=new ArrayList<>();
            LeaseOrder leaseOrder=null;
            while (rs.next()) {
                leaseOrder=new LeaseOrder();

                leaseOrder.setId(rs.getInt("id"));
                leaseOrder.setUid(rs.getInt("uid"));
                leaseOrder.setAccountId(rs.getInt("account_id"));
                leaseOrder.setStart(rs.getDate("start"));
                leaseOrder.setEnd(rs.getDate("end"));
                leaseOrder.setStatus(rs.getInt("status"));
                leaseOrder.setPrice(rs.getDouble("price"));
                leaseOrder.setDescription(rs.getString("description"));

                result.add(leaseOrder);
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<LeaseOrder> queryLeaseOrderByStatus(Integer status) {
        List<LeaseOrder> result=null;
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    "select * from lease_order where status=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,status);
            ResultSet rs=ps.executeQuery();
            result=new ArrayList<>();
            LeaseOrder leaseOrder=null;
            while (rs.next()) {
                leaseOrder=new LeaseOrder();

                leaseOrder.setId(rs.getInt("id"));
                leaseOrder.setUid(rs.getInt("uid"));
                leaseOrder.setAccountId(rs.getInt("account_id"));
                leaseOrder.setStart(rs.getDate("start"));
                leaseOrder.setEnd(rs.getDate("end"));
                leaseOrder.setStatus(rs.getInt("status"));
                leaseOrder.setPrice(rs.getDouble("price"));
                leaseOrder.setDescription(rs.getString("description"));

                result.add(leaseOrder);
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
