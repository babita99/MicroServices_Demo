package com.ProductStoreService.ProductStoreService.entitites;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Store")
public class ProductStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int storeId;
    private String storeName;
    private int inventoryNo;
    private String location;

}
