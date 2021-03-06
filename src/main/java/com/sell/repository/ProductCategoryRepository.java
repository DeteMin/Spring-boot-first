package com.sell.repository;

import com.sell.dataobject.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Integer> {

    List<ProductCategoryEntity> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
