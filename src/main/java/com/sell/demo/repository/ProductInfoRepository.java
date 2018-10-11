package com.sell.demo.repository;

import com.sell.demo.dataobject.ProductInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfoEntity,Integer> {

}
