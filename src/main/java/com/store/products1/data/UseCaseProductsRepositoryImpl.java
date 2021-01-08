package com.store.products1.data;

import com.store.products1.data.entities.ProductEntity;
import com.store.products1.data.repository.RepositoryDB;
import com.store.products1.domain.respository.ProductsRepository;
import com.store.products1.exceptions.GlobalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UseCaseProductsRepositoryImpl implements ProductsRepository  {


    @Autowired
    private RepositoryDB repositoryDB;

    @Override
    public List<ProductEntity> productsEntity() {

        List<ProductEntity> productsEntity = repositoryDB.findAll();
        if(Optional.ofNullable(productsEntity).isPresent()){
            return productsEntity;
        }
        throw new GlobalException("Error gateway", HttpStatus.BAD_GATEWAY);
    }
}
