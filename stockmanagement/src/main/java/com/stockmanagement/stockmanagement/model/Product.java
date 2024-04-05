package com.stockmanagement.stockmanagement.model;

import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.Date;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "productName", length = 255,nullable = false)
    private String productName;
    @Column(name = "productCategory", length = 255,nullable = false)
    private String productCategory;
    private float price;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;

    }
}
