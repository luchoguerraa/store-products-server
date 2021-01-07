package com.store.products1.domian.mapper;

import com.store.products1.data.entities.ProductEntity;
import com.store.products1.domain.dto.Product;
import com.store.products1.domain.mappers.ProductsMapper;
import com.store.products1.tools.MockProducts;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ProductsMapperTest {

    ProductsMapper productsMapper;

    @Before
    public void setup() {

        productsMapper = new ProductsMapper();
    }

    @Test
    public void returnProductsList() {

        List<ProductEntity> productsEntity = MockProducts.getProductsEntity();

        List<Product> products = productsMapper.convert(productsEntity);

        Assert.assertEquals(products.size(), productsEntity.size());

        for (int i = 0; i < products.size(); i++) {
            Assert.assertEquals(products.get(i).getId(), productsEntity.get(i).getId());
        }

    }
}
