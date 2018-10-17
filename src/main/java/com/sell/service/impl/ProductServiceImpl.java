package com.sell.service.impl;

import com.sell.dataobject.ProductInfoEntity;
import com.sell.enums.ProductStatusEnum;
import com.sell.repository.ProductInfoRepository;
import com.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: SuperJ
 * @Date: 2018/10/17 22:37
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfoEntity findOne(String productId) {
        return productInfoRepository.findOne(productId);
    }

    @Override
    public List<ProductInfoEntity> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.IP.getCode());
    }

    @Override
    public Page<ProductInfoEntity> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }
}
