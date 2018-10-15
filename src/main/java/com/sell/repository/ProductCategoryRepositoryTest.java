package com.sell.repository;

import com.sell.dataobject.ProductCategory;
import com.sell.dataobject.ProductCategoryEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){

        /**使用optional封装可以有效防止产生空指针异常*/
//       Optional<ProductCategoryEntity> productCategory =  repository.findById(1);
//       System.out.println(productCategory.toString());

        ProductCategoryEntity productCategoryEntity = repository.findOne(1);
    }

    @Test
    public void saveTest(){
        ProductCategoryEntity productCategory =new ProductCategoryEntity();
        productCategory.setCategoryName("热销榜");
        productCategory.setCategoryType(4);
        repository.save(productCategory);
    }

}