package com.sell.demo.repository;

import com.sell.demo.dataobject.ProductInfoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void saveTest(){
        ProductInfoEntity productInfoEntity = new ProductInfoEntity();
        productInfoEntity.setProductId("2");
        productInfoEntity.setCategoryType(2);
        productInfoEntity.setProductDescription("最新版iPhone");
        productInfoEntity.setProductIcon("http://xxxx.jpg");
        productInfoEntity.setProductName("IPhone MaX");
        productInfoEntity.setProductPrice(new BigDecimal(10699));
        productInfoEntity.setProductStock(100);
        productInfoRepository.save(productInfoEntity);
    }

    @Test
    public void findOneTest(){
        ProductInfoEntity productInfoEntity = new ProductInfoEntity();
        productInfoEntity.setCategoryType(2);
        Example<ProductInfoEntity> example = Example.of(productInfoEntity);
//        ProductInfoEntity p =  productInfoRepository.findOne(example);
//        List<ProductInfoEntity> list = productInfoRepository.findAll();
//        System.out.println(p.toString());


    }
}