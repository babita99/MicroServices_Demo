package com.Micro_CustomerServices.External.Service;


import com.Micro_CustomerServices.Entities.Items;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="PRODUCTSTORESERVICE")
public interface StoreService {

    @GetMapping("store/{storeId}")
    Items getStoreOfCustomer(@PathVariable("store") int storeId );

}
