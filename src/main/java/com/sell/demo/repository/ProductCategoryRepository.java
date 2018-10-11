package com.sell.demo.repository;

import com.sell.demo.dataobject.ProductCategory;
import com.sell.demo.dataobject.ProductCategoryEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Integer> {

    List<ProductCategoryEntity> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
