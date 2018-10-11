package com.sell.demo.service;

import com.sell.demo.dataobject.ProductCategoryEntity;

import java.util.List;

public interface CategoryService {

    ProductCategoryEntity findOne(Integer categoryId);

    List<ProductCategoryEntity> findAll();

    List<ProductCategoryEntity> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategoryEntity save(ProductCategoryEntity productCategory);
}
