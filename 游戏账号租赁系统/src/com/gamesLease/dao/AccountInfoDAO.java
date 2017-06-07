package com.gamesLease.dao;

import com.gamesLease.bean.AccountInfo;
import com.gamesLease.db.DBPool;
import com.gamesLease.db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyx11 on 2017-5-16.
 */
public class AccountInfoDAO {
    public AccountInfo getAccountInfo(String account, String password) {
        AccountInfo result = null;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "" +
                " select * from account_info where account=? and password=? ;";
        try {
            conn = DBPool.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, account);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = new AccountInfo();
                result.setId(rs.getInt("id"));
                result.setAccount(rs.getString("account"));
                result.setPassword(rs.getString("password"));
                result.setGameId(rs.getInt("game_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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

    public AccountInfo getAccountInfo(String account) {
        AccountInfo result = null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
             conn = DBPool.getConnection();
            String sql = "" +
                    " select * from account_info where account=? ;";
             ps = conn.prepareStatement(sql);
            ps.setString(1, account);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = new AccountInfo();
                result.setId(rs.getInt("id"));
                result.setAccount(rs.getString("account"));
                result.setPassword(rs.getString("password"));
                result.setGameId(rs.getInt("game_id"));
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

    public AccountInfo getAccountInfoById(Integer id) {
        AccountInfo result = null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn = DBPool.getConnection();
            String sql = "" +
                    " select * from account_info where id=?;";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = new AccountInfo();
                result.setId(rs.getInt("id"));
                result.setAccount(rs.getString("account"));
                result.setPassword(rs.getString("password"));
                result.setGameId(rs.getInt("game_id"));
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

    public List<AccountInfo> queryByAccount(String account) {
        List<AccountInfo> result = null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn = DBPool.getConnection();
            String sql = "" +
                    "select * from account_info where account=?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, account);

            ResultSet rs = ps.executeQuery();

            result = new ArrayList<>();
            while (rs.next()) {
                AccountInfo accountInfo = new AccountInfo();

                accountInfo.setId(rs.getInt("id"));
                accountInfo.setAccount(rs.getString("account"));
                accountInfo.setPassword(rs.getString("password"));
                accountInfo.setGameId(rs.getInt("game_id"));

                result.add(accountInfo);
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


    public boolean addAccountInfo(AccountInfo accountInfo) {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn = DBPool.getConnection();
            String sql = "" +
                    "insert into account_info (account,password,game_id) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, accountInfo.getAccount());
            ps.setString(2, accountInfo.getPassword());
            ps.setInt(3, accountInfo.getGameId());

            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                accountInfo.setId(rs.getInt(1));

                return true;  //try里的return执行完还会执行finally
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
}
