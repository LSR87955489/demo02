package com.qianfeng.day0328.goods.controller;

import com.qianfeng.day0328.goods.bean.WxbGood;
import com.qianfeng.day0328.goods.service.IGoodsService;
import com.qianfeng.day0328.goods.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoodsServlet extends HttpServlet {

    private IGoodsService goodsService = new GoodsServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageStr = req.getParameter("page");
        try {
            pageStr = pageStr==null?"1":pageStr;
            List<WxbGood> goodList =
                    goodsService.queryGoodsByPage(Integer.parseInt(pageStr));
            req.setAttribute("goodsList",goodList);
            req.getRequestDispatcher("goods_list.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
            //能处理就处理
            //不能处理就跳转到错误提示页面
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
