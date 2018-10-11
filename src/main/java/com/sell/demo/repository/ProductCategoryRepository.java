package com.sell.demo.repository;

import com.sell.demo.dataobject.ProductCategory;
import com.sell.demo.dataobject.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Integer> {

}
