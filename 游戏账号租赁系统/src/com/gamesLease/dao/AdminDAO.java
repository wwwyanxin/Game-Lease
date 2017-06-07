package com.gamesLease.dao;

import com.gamesLease.bean.Admin;
import com.gamesLease.db.DBPool;
import com.gamesLease.db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wyx11 on 2017-5-16.
 */
public class AdminDAO {
    public Admin getAdmin(String name, String password) {
        Admin result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= DBPool.getConnection();
            String sql = "" +
                    " select * from admin where name=? and password=? ;";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, password);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new Admin();
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
                result.setPassword(rs.getString("password"));
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
}
