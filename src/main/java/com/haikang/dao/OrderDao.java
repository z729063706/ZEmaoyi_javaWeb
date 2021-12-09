package com.haikang.dao;

import java.sql.SQLException;
import java.util.List;

import com.haikang.bean.Order;
import com.haikang.util.c3p0Util;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
public class OrderDao {
        public static List<Order> getOrdersBySupplyFlag(Integer supplyFlag,Integer limit){
            String sql = " SELECT * FROM ORDERS WHERE SUPPLYFLAG = ? LIMIT ? ";
            QueryRunner qr = new QueryRunner(c3p0Util.dataSource);
            List<Order> res = null;
            ResultSetHandler<List<Order>> rsh = new BeanListHandler<Order>(Order.class);
            try {
                res = qr.query(sql, rsh, supplyFlag, limit);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return res;
        }
    
}
