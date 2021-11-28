package com.zyh.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class BeanHandler {
    private Class<?> clazz;
    public BeanHandler(Class<?> clazz){
        this.clazz = clazz;
    }
    public Object handler(ResultSet rs){
        Object obj = null;
        try{
            if (rs.next()){
                obj = clazz.newInstance();
                ResultSetMetaData stmd = rs.getMetaData();
                int columnCount = stmd.getColumnCount();
                for (int i = 1; i <= columnCount; i++ ){
                    String columnName = stmd.getColumnLabel(i);
                    Object columnValue = rs.getObject(columnName)

                }
            }
        }
        return obj;
    } 
    
}
