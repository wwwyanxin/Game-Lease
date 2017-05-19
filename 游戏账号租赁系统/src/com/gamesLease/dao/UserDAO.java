package com.gamesLease.dao;

import com.gamesLease.bean.User;
import com.gamesLease.db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by wyx11 on 2017-5-14.
 */
public class UserDAO {
    public User getUser(String name, String password) {
        User result=null;
        try {
            Connection conn = new DBUtil().getConncetion();
            String sql = "" +
                    " select * from USER where name=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
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
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public User getUser(String name) {
        User result=null;
        try {
            Connection conn = new DBUtil().getConncetion();
            String sql = "" +
                    " select * from USER where name=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result=new User();
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
                result.setPassword(rs.getString("password"));
                result.setBalance(rs.getDouble("balance"));

            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public User getUserById(Integer id) {
        User result=null;
        try {
            Connection conn = new DBUtil().getConncetion();
            String sql = "" +
                    " select * from USER where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result=new User();
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
                result.setPassword(rs.getString("password"));
                result.setBalance(rs.getDouble("balance"));

            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean addUser(User user) {
        try {
            Connection conn = new DBUtil().getConncetion();
            String sql = "insert into user (name,password) values(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
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
        }
        return false;
    }
}
