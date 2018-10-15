package com.sell.controller;

import com.sell.VO.ResultVO;
import com.sell.dataobject.ProductCategoryEntity;
import com.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: SuperJ
 * @Date: 2018/10/14 14:45
 * @Description:买家商品
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list(){
        List<ProductCategoryEntity> productCategoryEntityList = categoryService.findAll();
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMeg("json数据返回成功！");
        resultVO.setData(productCategoryEntityList);
        return resultVO;
    }
}
