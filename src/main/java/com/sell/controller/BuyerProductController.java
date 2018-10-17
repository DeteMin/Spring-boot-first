package com.sell.controller;

import com.sell.VO.ProductInfoVO;
import com.sell.VO.ProductVO;
import com.sell.VO.ResultVO;
import com.sell.dataobject.ProductCategoryEntity;
import com.sell.dataobject.ProductInfoEntity;
import com.sell.service.CategoryService;
import com.sell.service.ProductService;
import com.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public ResultVO list(){

        /**
         * 查询所有上架商品
         */
        List<ProductInfoEntity> list = productService.findUpAll();

        List<Integer> categoryTypeList = list.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());

        List<ProductCategoryEntity> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        /**
         * 查询所有类目信息
         */
        List<ProductCategoryEntity> productCategoryEntityList = categoryService.findAll();

        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategoryEntity productCategoryEntity:productCategoryEntityList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategoryEntity.getCategoryType());
            productVO.setCategoryName(productCategoryEntity.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfoEntity productInfo: list) {
                if (productInfo.getCategoryType()==(productCategoryEntity.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}
