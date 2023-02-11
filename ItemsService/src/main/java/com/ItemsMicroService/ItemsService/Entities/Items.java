package com.ItemsMicroService.ItemsService.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.annotation.Documented;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;

    private int customerId;

    private int storeId;

    private String itemType;

    private int qty;

    private String storeName;

}
