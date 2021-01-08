package com.store.products1.data.repository;

import com.store.products1.data.entities.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDB extends MongoRepository<ProductEntity,Long> {
}
