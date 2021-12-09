package com.haikang.dao;

import java.sql.SQLException;
import java.util.List;

import com.haikang.bean.Company;
import com.haikang.util.c3p0Util;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class CompanyDao {
    public static List<Company> getCompanyByRole(Integer role,Integer limit){
        String sql = " SELECT * FROM COMPANY WHERE ROLE = ? LIMIT ? ";
        QueryRunner qr = new QueryRunner(c3p0Util.dataSource);
        ResultSetHandler<List<Company>> rsh = new BeanListHandler<Company>(Company.class);
        List<Company> re = null;
        try {
            re =  qr.query(sql, rsh, role, limit);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return re;
    }
    
}
