package com.gamesLease.dao;

import com.gamesLease.bean.AccountInfo;
import com.gamesLease.db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wyx11 on 2017-5-16.
 */
public class AccountInfoDAO {
    public AccountInfo getAccountInfo(String account, String password) {
        AccountInfo result=null;
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    " select * from account_info where name=? and password=? ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, account);
            ps.setString(2, password);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new AccountInfo();
                result.setId(rs.getInt("id"));
                result.setAccount(rs.getString("account"));
                result.setPassword(rs.getString("password"));
                result.setGameId(rs.getInt("game_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public AccountInfo getAccountInfoById(Integer id) {
        AccountInfo result=null;
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    " select * from account_info where id=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new AccountInfo();
                result.setId(rs.getInt("id"));
                result.setAccount(rs.getString("account"));
                result.setPassword(rs.getString("password"));
                result.setGameId(rs.getInt("game_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

/*    public AccountInfo getAccountInfoByGameId(Integer id) {
        AccountInfo result=null;
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    " select * from account_info where game_id=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                result=new AccountInfo();
                result.setId(rs.getInt("id"));
                result.setAccount(rs.getString("account"));
                result.setPassword(rs.getString("password"));
                result.setGameId(rs.getInt("game_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }*/

    public boolean addAccountInfo(AccountInfo accountInfo) {
        try{
            Connection conn=new DBUtil().getConncetion();
            String sql = "" +
                    "insert into account_info (account,password,game_id) values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, accountInfo.getAccount());
            ps.setString(2, accountInfo.getPassword());
            ps.setInt(3, accountInfo.getGameId());

            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                accountInfo.setId(rs.getInt("id"));
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
