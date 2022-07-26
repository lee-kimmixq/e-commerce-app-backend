package org.ekia.ecommerce.repository.entity;

import org.ekia.ecommerce.controller.dto.ProductDto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product_list")
public class Product
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private double price;

    private double priceDisc;

    private String description;

    private String imageUrl;

    private boolean isOnSale;

    private Date updatedAt;

    private Date createdAt;

    public Product() {
    }

    public Product(ProductDto productDto) {
        this.name = productDto.getName();
        this.price = productDto.getPrice();
        this.priceDisc = productDto.getPriceDisc();
        this.description = productDto.getDescription();
        this.imageUrl = productDto.getImageUrl();
        this.isOnSale = productDto.isOnSale();
        this.updatedAt = productDto.getUpdatedAt();
        this.createdAt = productDto.getCreatedAt();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceDisc() {
        return priceDisc;
    }

    public void setPriceDisc(double priceDisc) {
        this.priceDisc = priceDisc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}