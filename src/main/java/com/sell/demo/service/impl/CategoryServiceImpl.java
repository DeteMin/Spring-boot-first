package com.sell.demo.service.impl;

import com.sell.demo.dataobject.ProductCategoryEntity;
import com.sell.demo.repository.ProductCategoryRepository;
import com.sell.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategoryEntity findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategoryEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategoryEntity> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategoryEntity save(ProductCategoryEntity productCategory) {
        return repository.save(productCategory);
    }
}
