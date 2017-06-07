package com.gamesLease.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by wyx11 on 2017-5-14.
 */
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/games_lease?useSSL=false";
    //private static final String URL = "jdbc:mysql://47.93.243.224:3306/games_lease?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "1230.+";

    private Connection conn;

    public DBUtil() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public Connection getConncetion() {
        return conn;
    }
}
