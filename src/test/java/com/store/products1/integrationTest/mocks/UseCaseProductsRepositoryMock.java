package com.store.products1.integrationTest.mocks;

import com.store.products1.data.entities.ProductEntity;
import com.store.products1.tools.MockProducts;
import com.store.products1.domain.respository.ProductsRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
@Primary
@Profile("integration")
@Repository
public class UseCaseProductsRepositoryMock implements ProductsRepository {
        @Override
        public List<ProductEntity> productsEntity() {
            return MockProducts.getProductsEntity();
    }
}
