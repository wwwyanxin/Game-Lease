package com.gamesLease.dao;

import com.gamesLease.bean.LeaseOrder;
import com.gamesLease.db.DBPool;
import com.gamesLease.db.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyx11 on 2017-5-16.
 */
public class LeaseOrderDAO {
    public LeaseOrder getLeaseOrderByAccountId(Integer accountId) {
        LeaseOrder result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from lease_order where account_id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, accountId);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new LeaseOrder();
                result.setId(rs.getInt("id"));
                result.setUid(rs.getInt("uid"));
                result.setAccountId(rs.getInt("account_id"));
                result.setStart(rs.getTimestamp("start"));
                result.setEnd(rs.getTimestamp("end"));
                result.setPrice(rs.getDouble("price"));
                result.setStatus(rs.getInt("status"));
                result.setDescription(rs.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public LeaseOrder getLeaseOrderById(Integer id) {
        LeaseOrder result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from lease_order where id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new LeaseOrder();
                result.setId(rs.getInt("id"));
                result.setUid(rs.getInt("uid"));
                result.setAccountId(rs.getInt("account_id"));
                result.setStart(rs.getTimestamp("start"));
                result.setEnd(rs.getTimestamp("end"));
                result.setPrice(rs.getDouble("price"));
                result.setStatus(rs.getInt("status"));
                result.setDescription(rs.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public boolean addLeaseOrder(LeaseOrder leaseOrder) {
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= DBPool.getConnection();
            String sql = "" +
                    "insert into lease_order (uid,account_id,end,price,description) values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setInt(1,leaseOrder.getUid());
            ps.setInt(2, leaseOrder.getAccountId());
//            ps.setDate(3, (Date) leaseOrder.getEnd());
//            ps.setDate(3, new Date(leaseOrder.getEnd().getTime()));
            ps.setTimestamp(3, new Timestamp(leaseOrder.getEnd().getTime()));
            ps.setDouble(4, leaseOrder.getPrice());
            ps.setString(5,leaseOrder.getDescription());

            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                leaseOrder.setId(rs.getInt(1));
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean updateLeaseOrder(LeaseOrder leaseOrder) {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn= DBPool.getConnection();
            String sql = "" +
                    "update lease_order " +
                    "set end=?,price=?,status=?,description=? " +
                    "where id=?";
            ps = conn.prepareStatement(sql);
            ps.setTimestamp(1, new Timestamp(leaseOrder.getEnd().getTime()));
            ps.setDouble(2, leaseOrder.getPrice());
            ps.setInt(3, leaseOrder.getStatus());
            ps.setString(4, leaseOrder.getDescription());
            ps.setInt(5,leaseOrder.getId());

            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<LeaseOrder> queryLeaseOrder() {
        List<LeaseOrder> result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from lease_order ";
            ps = conn.prepareStatement(sql);

            ResultSet rs=ps.executeQuery();
            result=new ArrayList<>();
            LeaseOrder leaseOrder=null;
            while (rs.next()) {
                leaseOrder=new LeaseOrder();

                leaseOrder.setId(rs.getInt("id"));
                leaseOrder.setUid(rs.getInt("uid"));
                leaseOrder.setAccountId(rs.getInt("account_id"));
                leaseOrder.setStart(rs.getTimestamp("start"));
                leaseOrder.setEnd(rs.getTimestamp("end"));
                leaseOrder.setStatus(rs.getInt("status"));
                leaseOrder.setPrice(rs.getDouble("price"));
                leaseOrder.setDescription(rs.getString("description"));

                result.add(leaseOrder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    public List<LeaseOrder> queryLeaseOrderByUid(Integer uid) {
        List<LeaseOrder> result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from lease_order where uid=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,uid);
            ResultSet rs=ps.executeQuery();
            result=new ArrayList<>();
            LeaseOrder leaseOrder=null;
            while (rs.next()) {
                leaseOrder=new LeaseOrder();

                leaseOrder.setId(rs.getInt("id"));
                leaseOrder.setUid(rs.getInt("uid"));
                leaseOrder.setAccountId(rs.getInt("account_id"));
                leaseOrder.setStart(rs.getTimestamp("start"));
                leaseOrder.setEnd(rs.getTimestamp("end"));
                leaseOrder.setStatus(rs.getInt("status"));
                leaseOrder.setPrice(rs.getDouble("price"));
                leaseOrder.setDescription(rs.getString("description"));

                result.add(leaseOrder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public List<LeaseOrder> queryLeaseOrderByStatus(Integer status) {
        List<LeaseOrder> result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from lease_order where status=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,status);
            ResultSet rs=ps.executeQuery();
            result=new ArrayList<>();
            LeaseOrder leaseOrder=null;
            while (rs.next()) {
                leaseOrder=new LeaseOrder();

                leaseOrder.setId(rs.getInt("id"));
                leaseOrder.setUid(rs.getInt("uid"));
                leaseOrder.setAccountId(rs.getInt("account_id"));
                leaseOrder.setStart(rs.getTimestamp("start"));
                leaseOrder.setEnd(rs.getTimestamp("end"));
                leaseOrder.setStatus(rs.getInt("status"));
                leaseOrder.setPrice(rs.getDouble("price"));
                leaseOrder.setDescription(rs.getString("description"));

                result.add(leaseOrder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public List<LeaseOrder> queryLeaseOrderByDescription(String description,Integer status) {//根据描述查找
        List<LeaseOrder> result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from lease_order where description like ? And status=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"%"+description+"%");
            ps.setInt(2,status);
            ResultSet rs=ps.executeQuery();
            result=new ArrayList<>();
            LeaseOrder leaseOrder=null;
            while (rs.next()) {
                leaseOrder=new LeaseOrder();

                leaseOrder.setId(rs.getInt("id"));
                leaseOrder.setUid(rs.getInt("uid"));
                leaseOrder.setAccountId(rs.getInt("account_id"));
                leaseOrder.setStart(rs.getTimestamp("start"));
                leaseOrder.setEnd(rs.getTimestamp("end"));
                leaseOrder.setStatus(rs.getInt("status"));
                leaseOrder.setPrice(rs.getDouble("price"));
                leaseOrder.setDescription(rs.getString("description"));

                result.add(leaseOrder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


}
