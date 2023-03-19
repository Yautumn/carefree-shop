package com.yautumn.remot;

import com.yautumn.common.utils.ResultUtil;
import com.yautumn.remot.remote.ServiceFallback;
import com.yautumn.remot.request.ShopCommodityParam;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "CAREFREEBASE" , fallback = ServiceFallback.class)
public interface CareFreeBaseServiceClient {
    @RequestMapping(value ="/shop/commodity/find/id",method = RequestMethod.GET)
    ResultUtil findCommodityById(@RequestParam @ApiParam(value = "商品id" , defaultValue = "1")int shopCommodityId);

    /**
     * 批量保存商品信息
     */
    @RequestMapping(value = "/shop/commodity/batch/insert")
    ResultUtil batchInsertCommodity(@RequestBody List<ShopCommodityParam> shopCommodityParams);


}
