package com.gamesLease.db;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by wyx11 on 2017-6-7.
 */
public class DBPool {
    private static DataSource pool;

    static {
        Context env = null;
        try {
            env = (Context) new InitialContext().lookup("java:comp/env");
            pool = (DataSource) env.lookup("jdbc/test");
            if (pool == null) {
                System.err.println("'DBPool' is an unknown DataSource");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public static DataSource getPool() {
        return pool;
    }

    public static Connection getConnection() {
        Connection conn=null;
        try {
            conn= pool.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
