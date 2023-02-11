package com.ItemsMicroService.ItemsService.Impl;

import com.ItemsMicroService.ItemsService.Entities.Items;
import com.ItemsMicroService.ItemsService.Services.ItemsServices;
import com.ItemsMicroService.ItemsService.repositories.ItemsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsServices {

    @Autowired
    private ItemsRepositories itemsRepositories;

    @Override
    public Items createNewItems(Items items) {
        System.out.println("===items=="+items);
        return itemsRepositories.save(items);
    }

    @Override
    public List<Items> getAllItemsList() {
        return itemsRepositories.findAll();
    }

    @Override
    public List<Items> getItemsById(int itemId) {
        return null;
    }

    @Override
    public List getItemsByCustomerId(int customerId) {
        return itemsRepositories.findBycustomerId(customerId);
    }

    @Override
    public List getItemsByProductStoreId(int storeId) {
        return itemsRepositories.findBystoreId(storeId);
    }
}
