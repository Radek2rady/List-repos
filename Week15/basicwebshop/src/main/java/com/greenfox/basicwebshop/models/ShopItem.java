package com.greenfox.basicwebshop.models;

public class ShopItem {
    private String name;
    private String description;
    private Double price;
    private Integer quantityStock;
    private String type;

    public ShopItem(String name, String description, Double price, Integer quantityStock, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityStock = quantityStock;
        this.type = type;
    }

    public ShopItem() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
