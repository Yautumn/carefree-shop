package com.yautumn.controller;

import com.yautumn.common.utils.ResultUtil;
import com.yautumn.remot.CareFreeBaseServiceClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Api(tags = "店铺订单信息接口")
@RestController
@RequestMapping("/shop/order")
public class UserController {

    @Autowired
    private CareFreeBaseServiceClient careFreeBaseServiceClient;

    @ApiOperation(value = "查询订单信息方法")
    @PostMapping("/find/id")
    public ResultUtil findUserById(@RequestParam @ApiParam(value = "商品id" , defaultValue = "1")int shopCommodityId){
        ResultUtil resultUtil = careFreeBaseServiceClient.findCommodityById(shopCommodityId);
        System.out.println(resultUtil.getResultMsg());
        return resultUtil;
    }

    @ApiOperation(value = "测试文件上传")
    @PostMapping("/upload")
    public ResultUtil findUserById(@RequestPart("file1") MultipartFile file, @RequestParam String fileUploadPath, @RequestParam int shopId){
        // 1、获取文件的原始文件名, 通过原始文件名获取文件后缀 例如：abc.jpg
        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        // 2、重新生成文件名，防止文件名称重复造成文件覆盖
        String fileName = String.valueOf(shopId) + suffix;

        // 3、创建一个目录对象
        File dir = new File(fileUploadPath);
        //判断当前目录是否存在
        if (!dir.exists()) {
            //目录不存在，需要创建
            dir.mkdirs();
        }

        try {
            // 4、将临时文件转存到指定位置
            file.transferTo(new File(fileUploadPath + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultUtil.success(fileName);
    }
}
