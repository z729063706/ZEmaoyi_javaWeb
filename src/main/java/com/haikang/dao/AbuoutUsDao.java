package com.haikang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.haikang.bean.AboutUs;
import com.haikang.util.c3p0Util;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class AbuoutUsDao {
    
    public static int insertAboutUs(AboutUs aboUs){
        String sql = "insert into aboutus(title,pic) values (?,?)";
        return c3p0Util.update(sql, aboUs.getTitle(),aboUs.getPic());
    }
    public static int delAboutUs(Integer id){
        String sql = "delete from aboutus where id = ?";
        return c3p0Util.update(sql, id);
    }
    public static int editAboutUs(AboutUs aboUs,Integer id){
        String sql = "update aboutus set title = ?, pic = ? where id = ?";
        return c3p0Util.update(sql, aboUs.getTitle(),aboUs.getPic(),id);        
    }

    public static List<AboutUs> getAboutUs(){
        List<AboutUs> re = new ArrayList<AboutUs>(); 
        String sql = "select * from aboutus";
        QueryRunner qr = new QueryRunner(c3p0Util.dataSource);
        ResultSetHandler<List<AboutUs>> rsh = new BeanListHandler<AboutUs>(AboutUs.class);
        try {
            re = qr.query(sql, rsh);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return re;
    } 
    public static AboutUs getAboutUsById(Integer id){
        AboutUs aboutus = null;
        String sql = " select * from aboutus WHERE ID=? ";
        QueryRunner qr = new QueryRunner(c3p0Util.dataSource);
        ResultSetHandler<AboutUs> rsh = new BeanHandler<AboutUs>(AboutUs.class);
        try {
            aboutus = qr.query(sql, rsh, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aboutus;
    }
}
