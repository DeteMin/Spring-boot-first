package com.sell.service;

import com.sell.dataobject.ProductInfoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Auther: SuperJ
 * @Date: 2018/10/17 22:27
 * @Description:
 */
public interface ProductService {
    /**
     * 通过商品id查询单个商品
     * @param productId
     * @return
     */
    ProductInfoEntity findOne(String productId);

    /**
     * 查询所有商品信息
     * @return
     */
    List<ProductInfoEntity> findUpAll();

    /**
     * 分页查询所有信息列表
     * @param pageable
     * @return
     */
    Page<ProductInfoEntity> findAll(Pageable pageable);
}
