package com.sell.repository;

import com.sell.dataobject.ProductInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfoEntity,Integer> {

    List<ProductInfoEntity> findByProductStatus(Integer productStatus);
}
