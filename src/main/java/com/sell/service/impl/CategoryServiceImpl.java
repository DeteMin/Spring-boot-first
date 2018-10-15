package com.sell.service.impl;


import com.sell.dataobject.ProductCategoryEntity;
import com.sell.repository.ProductCategoryRepository;
import com.sell.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
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
