package com.yautumn.dao;

import com.yautumn.common.entity.CommodityRepertory;

public interface CommodityRepertoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityRepertory record);

    int insertSelective(CommodityRepertory record);

    CommodityRepertory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityRepertory record);

    int updateByPrimaryKey(CommodityRepertory record);
}