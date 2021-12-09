package com.haikang.contorller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haikang.bean.AboutUs;
import com.haikang.bean.Company;
import com.haikang.bean.Order;
import com.haikang.dao.AbuoutUsDao;
import com.haikang.dao.CompanyDao;
import com.haikang.dao.OrderDao;


@WebServlet("/index")
public class indexContorller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        AboutUs aboutUs = AbuoutUsDao.getAboutUsById(99);
        List<Order> GongOrders = OrderDao.getOrdersBySupplyFlag(1,4);
        List<Order> CaiOrders = OrderDao.getOrdersBySupplyFlag(0,4);
        List<Company> cn = CompanyDao.getCompanyByRole(1, 5);
        List<Company> rs = CompanyDao.getCompanyByRole(2, 5);
        List<Company> zf = CompanyDao.getCompanyByRole(3, 5);
        req.setAttribute("aboutus", aboutUs);
        req.setAttribute("gong", GongOrders);
        req.setAttribute("cai", CaiOrders);
        req.setAttribute("cn", cn);
        req.setAttribute("rs", rs);
        req.setAttribute("zf", zf);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
    }
}
