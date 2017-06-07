package com.gamesLease.dao;

import com.gamesLease.bean.User;
import com.gamesLease.db.DBPool;
import com.gamesLease.db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wyx11 on 2017-5-14.
 */
public class UserDAO {
    public User getUser(String name, String password) {
        User result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            //Connection conn= DBPool.getConnection();
            conn= DBPool.getConnection();
            String sql = "" +
                    " select * from user where name=? and password=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result=new User();
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
                result.setPassword(rs.getString("password"));
                result.setBalance(rs.getDouble("balance"));
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
    public User getUser(String name) {
        User result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            //Connection conn= DBPool.getConnection();
            conn= DBPool.getConnection();
            String sql = "" +
                    " select * from user where name=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result=new User();
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
                result.setPassword(rs.getString("password"));
                result.setBalance(rs.getDouble("balance"));

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

    public User getUserById(Integer id) {
        User result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            //Connection conn= DBPool.getConnection();
            conn= DBPool.getConnection();
            String sql = "" +
                    " select * from user where id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result=new User();
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
                result.setPassword(rs.getString("password"));
                result.setBalance(rs.getDouble("balance"));

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

    public boolean addUser(User user) {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            //Connection conn= DBPool.getConnection();
            conn= DBPool.getConnection();
            String sql = "insert into user (name,password) values(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPassword());

            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                user.setId(rs.getInt("id"));
                return true;
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
        return false;
    }

    public boolean updateUser(User user) {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            //Connection conn= DBPool.getConnection();
            conn= DBPool.getConnection();
            String sql = "" +
                    "update user set name=?,password=?,balance=? where id=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPassword());
            ps.setDouble(3,user.getBalance());
            ps.setInt(4, user.getId());

            ps.execute();
            return true;
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
}
