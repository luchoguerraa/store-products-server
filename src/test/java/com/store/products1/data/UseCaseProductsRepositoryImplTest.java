package com.store.products1.data;

import com.store.products1.data.entities.ProductEntity;
import com.store.products1.exceptions.GlobalException;
import com.store.products1.tools.MockProducts;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UseCaseProductsRepositoryImplTest {

    @Mock
    private MongoTemplate mongoTemplate;

    @InjectMocks
    UseCaseProductsRepositoryImpl useCaseProductsRepositoryImpl;

    @Test
    public void callFindAll(){

        when(mongoTemplate.findAll(ProductEntity.class)).thenReturn(MockProducts.getProductsEntity());
        List<ProductEntity> productsEntity = useCaseProductsRepositoryImpl.productsEntity();
        Assert.assertNotNull(productsEntity);

    }

    @Test(expected = GlobalException.class)
    public void callFindAllAndReturnGlobalException(){

        when(mongoTemplate.findAll(ProductEntity.class)).thenReturn(null);
        useCaseProductsRepositoryImpl.productsEntity();

    }

}
