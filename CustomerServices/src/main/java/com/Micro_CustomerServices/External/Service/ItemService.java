package com.Micro_CustomerServices.External.Service;


import com.Micro_CustomerServices.Entities.Items;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ITEMSSERVICE")
public interface ItemService {

    @GetMapping("customer/{customerId}")
    Items getItemsOfCustome(@PathVariable("customer") int customerId );

}
