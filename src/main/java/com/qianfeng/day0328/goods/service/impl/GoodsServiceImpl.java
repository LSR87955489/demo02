package com.qianfeng.day0328.goods.service.impl;

import com.qianfeng.day0328.commons.info.SystemConstantsUtils;
import com.qianfeng.day0328.goods.bean.WxbGood;
import com.qianfeng.day0328.goods.dao.IGoodsDAO;
import com.qianfeng.day0328.goods.dao.impl.GoodsDAOImpl;
import com.qianfeng.day0328.goods.service.IGoodsService;

import java.util.List;

public class GoodsServiceImpl implements IGoodsService {

    private IGoodsDAO goodsDAO = new GoodsDAOImpl();

    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) throws Exception {
        if (page < 1) {
            throw new IndexOutOfBoundsException("页码不能小于1");
        }

        //计算起始下标
        int index = (page-1)* SystemConstantsUtils.Page.PAGE_SIZE;

        List<WxbGood> goods = goodsDAO.queryGoodsByPage(index);
        return goods;
    }
}
