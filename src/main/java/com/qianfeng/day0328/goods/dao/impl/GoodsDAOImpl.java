package com.qianfeng.day0328.goods.dao.impl;

import com.qianfeng.day0328.commons.info.SystemConstantsUtils;
import com.qianfeng.day0328.commons.mybatis.MyBatisSessionFactoryUtils;
import com.qianfeng.day0328.goods.bean.WxbGood;
import com.qianfeng.day0328.goods.dao.IGoodsDAO;
import com.qianfeng.day0328.goods.mapper.GoodsMapper;
import java.util.List;

/**
 * MyBatis的商品数据访问层
 *
 * 注意：
 * 异常在dao层不要捕获
 */
public class GoodsDAOImpl implements IGoodsDAO {

    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) throws Exception {
        GoodsMapper goodsMapper = MyBatisSessionFactoryUtils.getSession().getMapper(GoodsMapper.class);
        List<WxbGood> goods = goodsMapper.queryGoodsByPage(page, SystemConstantsUtils.Page.PAGE_SIZE);
        return goods;
    }
}
