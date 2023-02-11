package com.Micro_CustomerServices.Repositories;

import com.Micro_CustomerServices.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositories extends JpaRepository<Customer,Integer>
{
//     if we want any customer query we can do here.
}
