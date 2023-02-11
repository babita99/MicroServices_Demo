package com.Micro_CustomerServices.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@ToString
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor


@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String customerName;

    private String customerEmail;

    private String customerAbout;


    @Transient
    private List<Items> BuyItemsList =new ArrayList<>();

}
