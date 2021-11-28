package com.zyh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zyh.bean.aboutUs;
import com.zyh.util.c3p0Util;

public class abuoutUsDao {
    public static void main(String[] args) {        
        insertAboutUs(new aboutUs("a","b"));
        List<aboutUs> re = getAboutUs();
        for (aboutUs ab : re){
            System.out.println("tittle:"+ab.getTitle());
            System.out.println("tittle:"+ab.getPic());
        }
        aboutUs newab = new aboutUs("a","b");
        editAboutUs(newab, 3);
        delAboutUs(1);
    }
    public static int insertAboutUs(aboutUs aboUs){
        String sql = "insert into aboutus(title,pic) values (?,?)";
        return c3p0Util.update(sql, aboUs.getTitle(),aboUs.getPic());
    }
    public static int delAboutUs(Integer id){
        String sql = "delete from aboutus where id = ?";
        return c3p0Util.update(sql, id);
    }
    public static int editAboutUs(aboutUs aboUs,Integer id){
        String sql = "update aboutus set title = ?, pic = ? where id = ?";
        return c3p0Util.update(sql, aboUs.getTitle(),aboUs.getPic(),id);        
    }

    public static List<aboutUs> getAboutUs(){
        List<aboutUs> re = new ArrayList<aboutUs>(); 
        String sql = "select * from aboutus";
        PreparedStatement prst = null;
        Connection conn = null;
        ResultSet res = null;
        try {
            conn = c3p0Util.getConnection();
            prst = conn.prepareStatement(sql);
            res = prst.executeQuery(); 
            while(res.next()){
                re.add(new aboutUs(res.getString("title"), res.getString("pic")));
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
