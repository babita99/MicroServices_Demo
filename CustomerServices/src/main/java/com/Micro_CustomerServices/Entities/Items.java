package com.Micro_CustomerServices.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Items
{
    private int itemId;

    private int customerId;

    private int storeId;

    private String ItemType;

    private int Qty;

    private String storeName;

    private ProductStore productStore;
}
