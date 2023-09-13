package com.gearstore.peakpacker.models;

import jakarta.persistence.*;

import javax.swing.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(length = 255, nullable = false)
    private String productName;

    @Column(length = 1000)
    private String description;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer stockQuantity;

    @Column(length = 255)
    private String productImageURL;

    public Product() {
    }

    // create new object and set its attribute all at once
    public Product (String productName, String description, BigDecimal price, Integer stockQuantity, String productImageURL){
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.productImageURL = productImageURL;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public Integer getStockQuantity(){
        return stockQuantity;
    }
    public void setStockQuantity(Integer stockQuantity){
        this.stockQuantity = stockQuantity;
    }
    public String getProductImageURL(){
        return productImageURL;
    }
    public void setProductImageURL(String productImageURL){
        this.productImageURL = productImageURL;
    }
}
