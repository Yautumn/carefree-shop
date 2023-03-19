package com.yautumn.remot.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ShopCommodityParam {

    @ApiModelProperty(example = "1",value = "商户id")
    private int shopId;

    @ApiModelProperty(example = "XXX",value = "商品品牌")
    private String productBrand;

    @ApiModelProperty(example = "电线",value = "商品名称")
    private String productName;

    @ApiModelProperty(example = "XXX",value = "商品型号")
    private String productType;

    @ApiModelProperty(example = "2.5㎡",value = "商品规格")
    private String productSpecific;

    @ApiModelProperty(example = "米",value = "商品单位")
    private String productUnit;

    @ApiModelProperty(example = "备注",value = "备注")
    private String remark;

}
