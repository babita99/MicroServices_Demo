package com.Micro_CustomerServices.Impl;

import com.Micro_CustomerServices.Entities.Customer;
import com.Micro_CustomerServices.Entities.Items;
import com.Micro_CustomerServices.Entities.ProductStore;
import com.Micro_CustomerServices.Exception.ResourceNotFounnd;
import com.Micro_CustomerServices.External.Service.ItemService;
import com.Micro_CustomerServices.External.Service.StoreService;
import com.Micro_CustomerServices.Repositories.CustomerRepositories;
import com.Micro_CustomerServices.Services.CustomerService;
import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepositories customerRepositories;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ItemService itemService;


    @Autowired
    private StoreService storeService;

    private Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepositories.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepositories.findAll();
    }

    @Override
    public Customer getCustomer(int customerId) {
        Customer customer = customerRepositories.findById(customerId).orElseThrow(() -> new ResourceNotFounnd("User With give Id is not found !"));
        Items[] itemsOfCustomer = restTemplate.getForObject("http://ITEMSSERVICE/items/customer/" + customer.getCustomerId(), Items[].class);



        List<Items> productOfCustomerList = Arrays.asList(itemsOfCustomer);

        List<Items> itemList = productOfCustomerList.stream().map(item -> {

            int storeId = item.getStoreId();
            System.out.println("==========storeId==========="+storeId);

            ProductStore store = storeService.getStoreOfCustomer('2');

            item.setProductStore(store);

            return item;
        }).collect(Collectors.toList());

        customer.setBuyItemsList(itemList   );
        return customer;
    }
}

