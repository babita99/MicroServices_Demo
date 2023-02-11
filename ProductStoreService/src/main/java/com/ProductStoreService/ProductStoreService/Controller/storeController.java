package com.ProductStoreService.ProductStoreService.Controller;

import com.ProductStoreService.ProductStoreService.Service.ProductStoreService;
import com.ProductStoreService.ProductStoreService.entitites.ProductStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/store")
@RestController
public class storeController {

    @Autowired
    private ProductStoreService productStoreService;

    @PostMapping
    public ResponseEntity<ProductStore> createProductStore(@RequestBody ProductStore store)
    {
        ProductStore productStore = productStoreService.createStore(store);
        System.out.println("=====store========="+store);
        return ResponseEntity.status(HttpStatus.CREATED).body(productStore);
    }

    @GetMapping("/{storeId}")
    public ResponseEntity getSingleProductStore(@PathVariable("storeId") int storeId) {
        ProductStore store = productStoreService.getStore(storeId);
        return ResponseEntity.ok(store);
    }

    @GetMapping
    public ResponseEntity getAllProductStore() {
        List stores = productStoreService.getAllProductStores();
        return ResponseEntity.ok(stores);
    }
}
