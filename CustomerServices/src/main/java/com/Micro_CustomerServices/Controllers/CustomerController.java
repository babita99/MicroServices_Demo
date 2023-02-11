package com.Micro_CustomerServices.Controllers;

import com.Micro_CustomerServices.Entities.Customer;
import com.Micro_CustomerServices.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer customer1 = customerService.saveCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer1);
    }


    @GetMapping("/{customerId}")
    public ResponseEntity getSingleCustomer(@PathVariable("customerId") int customerId) {
        Customer customer2 = customerService.getCustomer(customerId);
        return ResponseEntity.ok(customer2);
    }

    @GetMapping
    public ResponseEntity getAllUser() {
        List customer3 = customerService.getAllCustomer();
        return ResponseEntity.ok(customer3);
    }

}
