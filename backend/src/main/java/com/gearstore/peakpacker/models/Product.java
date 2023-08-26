package com.gearstore.peakpacker.models;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String size;
    private Double price;
    private String material;
    private String productImageURL;


    //@ManyToOne
    //private Category category;
}
