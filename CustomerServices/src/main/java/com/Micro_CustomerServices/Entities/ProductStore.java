package com.Micro_CustomerServices.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class ProductStore {


    private int storeId;
    private String storeName;
    private int inventoryNo;
    private String location;
}

