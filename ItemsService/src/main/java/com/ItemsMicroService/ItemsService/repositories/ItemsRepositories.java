package com.ItemsMicroService.ItemsService.repositories;

import com.ItemsMicroService.ItemsService.Entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemsRepositories extends JpaRepository<Items,Integer> {


    // custom methods
    List<Items> findBycustomerId(int id);
    List<Items> findBystoreId(int storeId);
}

