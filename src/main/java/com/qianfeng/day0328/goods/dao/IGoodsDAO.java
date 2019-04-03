package com.qianfeng.day0328.goods.dao;

import com.qianfeng.day0328.goods.bean.WxbGood;

import java.util.List;

/**
 * 商品管理
 */
public interface IGoodsDAO {

    List<WxbGood> queryGoodsByPage(Integer page) throws Exception;
}
