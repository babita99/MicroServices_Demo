package com.ProductStoreService.ProductStoreService.Service;

import com.ProductStoreService.ProductStoreService.Repositories.Repositories.StoreRepositories;
import com.ProductStoreService.ProductStoreService.entitites.ProductStore;

import java.util.List;

public interface ProductStoreService  {

    ProductStore createStore(ProductStore store);

    List getAllProductStores();

    ProductStore getStore(int storeId);
}
