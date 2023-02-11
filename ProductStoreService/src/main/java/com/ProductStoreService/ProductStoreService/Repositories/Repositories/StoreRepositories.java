package com.ProductStoreService.ProductStoreService.Repositories.Repositories;

import com.ProductStoreService.ProductStoreService.entitites.ProductStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepositories extends JpaRepository<ProductStore,Integer> {
}
