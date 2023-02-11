package com.Micro_CustomerServices.Services;

import com.Micro_CustomerServices.Entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {


//    Customer services operation
    Customer saveCustomer(Customer customer);

    List<Customer>  getAllCustomer();


    Customer getCustomer(int customerId);
}
