package com.ItemsMicroService.ItemsService.Services;

import com.ItemsMicroService.ItemsService.Entities.Items;

import java.util.List;

public interface ItemsServices {

    Items createNewItems(Items items);

    // get all items list
    List<Items> getAllItemsList();

    // get all items list by its ids
    List<Items> getItemsById(int itemId);


    // get all items list by its customers
    List<Items> getItemsByCustomerId(int id);

     // get all items list by its products stores
    List<Items> getItemsByProductStoreId(int storeId);


}
