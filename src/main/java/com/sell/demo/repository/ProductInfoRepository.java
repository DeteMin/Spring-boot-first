package com.sell.demo.repository;

import com.sell.demo.dataobject.ProductInfoEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductInfoRepository extends JpaRepository<ProductInfoEntity,Integer> {

    List<ProductInfoEntity> findByProductStatus(Integer productStatus);
}
