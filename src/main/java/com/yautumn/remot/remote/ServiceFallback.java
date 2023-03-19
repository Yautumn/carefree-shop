package com.yautumn.remot.remote;

import com.yautumn.common.utils.ResultUtil;
import com.yautumn.remot.CareFreeBaseServiceClient;
import com.yautumn.remot.request.ShopCommodityParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceFallback implements CareFreeBaseServiceClient {
    @Override
    public ResultUtil findCommodityById(int shopCommodityId) {
        return ResultUtil.error("服务调用失败");
    }

    @Override
    public ResultUtil batchInsertCommodity(List<ShopCommodityParam> shopCommodityParams) {
        return ResultUtil.error("服务调用失败");
    }
}
