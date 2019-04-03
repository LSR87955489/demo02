package com.qianfeng.day0328.goods.mapper;

import com.qianfeng.day0328.goods.bean.WxbGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    List<WxbGood> queryGoodsByPage(@Param("index") Integer index, @Param("size") Integer size);
}
