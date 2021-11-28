package com.zyh.util;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class dbUtil {
    public static Connection getConnection() {
        FileInputStream fis = null;
        Properties pro = null;
        try {
            fis = new FileInputStream("src/database.properties");
            pro = new Properties();  
            pro.load(fis);   
            fis.close();  
        } catch (IOException e1) {
            e1.printStackTrace();
        }        //创建Properties对象
		
        Connection conn = null;
        try {
            String sqlAddress = pro.getProperty("url");
            String user = pro.getProperty("user");
            String pass = pro.getProperty("pass");
            Class.forName(pro.getProperty("classname"));
            conn = DriverManager.getConnection(sqlAddress,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static int closeAll(Connection conn, Statement stmt){
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }
    public static int closeAll(Connection conn, PreparedStatement prst){
        try {
            prst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }
}

