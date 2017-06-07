package com.gamesLease.dao;

import com.gamesLease.bean.Game;
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
public class GameDAO {
    public Game getGame(String name) {
        Game result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from game where name = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result=null;
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
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

    public Game getGameById(Integer id) {
        Game result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from game where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result=new Game();
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
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

    public List<Game> queryGame() {
        List<Game> result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from game ";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            result=new ArrayList<>();
            Game game=null;
            while (rs.next()) {
                game=new Game();
                game.setId(rs.getInt("id"));
                game.setName(rs.getString("name"));
                result.add(game);
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

    public List<Game> queryGame(String name) {//模糊查找
        List<Game> result=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn= DBPool.getConnection();
            String sql = "" +
                    "select * from game like %?% ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            Game game=null;
            while (rs.next()) {
                game=new Game();
                game.setId(rs.getInt("id"));
                game.setName(rs.getString("name"));
                result.add(game);
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
