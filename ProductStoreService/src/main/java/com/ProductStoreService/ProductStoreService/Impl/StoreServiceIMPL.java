package com.ProductStoreService.ProductStoreService.Impl;

import com.ProductStoreService.ProductStoreService.Exception.ResourceNotFounnd;
import com.ProductStoreService.ProductStoreService.Repositories.Repositories.StoreRepositories;
import com.ProductStoreService.ProductStoreService.Service.ProductStoreService;
import com.ProductStoreService.ProductStoreService.entitites.ProductStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StoreServiceIMPL  implements ProductStoreService {
@Autowired
private StoreRepositories storeRepositories;

@Override
    public ProductStore createStore(ProductStore store) {
        return storeRepositories.save(store);
    }

    @Override
    public List<ProductStore> getAllProductStores() {
        return storeRepositories.findAll();
    }

    @Override
    public ProductStore getStore(int storeId) {
        return storeRepositories.findById(storeId).orElseThrow(() -> new ResourceNotFounnd("Store With given storeId is not found !"));

    }
}
