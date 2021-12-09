package com.test;

import java.util.List;

import com.haikang.bean.AboutUs;
import com.haikang.dao.AbuoutUsDao;

public class aboutUsTest {
    public static void main(String[] args) {    
        //abuoutUsDao.insertAboutUs(new aboutUs("a","b"));
        // List<AboutUs> re = AbuoutUsDao.getAboutUs();
        // for (AboutUs ab : re){
        //     System.out.println("tittle:"+ab.getTitle());
        //     System.out.println("tittle:"+ab.getPic());
        // }
        // aboutUs newab = new aboutUs("a","b");
        // abuoutUsDao.editAboutUs(newab, 3);
        // abuoutUsDao.delAboutUs(1);
        AboutUs aboutUs = AbuoutUsDao.getAboutUsById(99);
        System.out.println(aboutUs.getTitle());
    }
}
