package com.qianfeng.day0328.goods.service;

import com.qianfeng.day0328.goods.bean.WxbGood;

import java.util.List;

public interface IGoodsService {

    List<WxbGood> queryGoodsByPage(Integer page) throws Exception;
}
