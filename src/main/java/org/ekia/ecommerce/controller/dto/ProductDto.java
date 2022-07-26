package org.ekia.ecommerce.controller.dto;

import java.util.Date;

public class ProductDto
{
    private String name;

    private double price;

    private double priceDisc;

    private String description;

    private String imageUrl;

    private boolean isOnSale;

    private Date updatedAt;

    private Date createdAt;

    public ProductDto(String name, double price, double priceDisc, String description, String imageUrl, boolean isOnSale, Date updatedAt, Date createdAt) {
        this.name = name;
        this.price = price;
        this.priceDisc = priceDisc;
        this.description = description;
        this.imageUrl = imageUrl;
        this.isOnSale = isOnSale;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
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