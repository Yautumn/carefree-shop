package com.yautumn.dao;

import com.yautumn.common.entity.CargoAgentOrder;

public interface CargoAgentOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CargoAgentOrder record);

    int insertSelective(CargoAgentOrder record);

    CargoAgentOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CargoAgentOrder record);

    int updateByPrimaryKey(CargoAgentOrder record);
}