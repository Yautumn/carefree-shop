package com.yautumn.dao;

import com.yautumn.common.entity.CargoPurchaseInfo;

public interface CargoPurchaseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CargoPurchaseInfo record);

    int insertSelective(CargoPurchaseInfo record);

    CargoPurchaseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CargoPurchaseInfo record);

    int updateByPrimaryKey(CargoPurchaseInfo record);
}