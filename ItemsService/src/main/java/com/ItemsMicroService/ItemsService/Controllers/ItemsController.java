package com.ItemsMicroService.ItemsService.Controllers;

import com.ItemsMicroService.ItemsService.Entities.Items;
import com.ItemsMicroService.ItemsService.Services.ItemsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")

public class ItemsController {

    @Autowired
    private ItemsServices itemsServices;

    @PostMapping
    public ResponseEntity<Items> CreateItems(@RequestBody  Items items) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itemsServices.createNewItems(items));
    }

    @GetMapping
    public ResponseEntity getAllItemsList() {
        List itemsAll = itemsServices.getAllItemsList();
        return ResponseEntity.ok(itemsAll);
    }

    @GetMapping("customer/{customerId}")
    public ResponseEntity getItemsByCustomerId(@PathVariable int customerId) {
        return ResponseEntity.ok(itemsServices.getItemsByCustomerId(customerId));
    }

    @GetMapping("stores/{storeId}")
    public ResponseEntity getItemsByProductStoreId(@PathVariable int storeId) {
        return ResponseEntity.ok(itemsServices.getItemsByProductStoreId(storeId));
    }

}
