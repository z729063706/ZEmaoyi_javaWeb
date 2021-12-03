package com.haikang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.haikang.bean.AboutUs;
import com.haikang.util.c3p0Util;

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
        PreparedStatement prst = null;
        Connection conn = null;
        ResultSet res = null;
        try {
            conn = c3p0Util.getConnection();
            prst = conn.prepareStatement(sql);
            res = prst.executeQuery(); 
            while(res.next()){
                re.add(new AboutUs(res.getString("title"), res.getString("pic")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            res.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        c3p0Util.closeAll(conn, prst);
        return re;
    } 
}
