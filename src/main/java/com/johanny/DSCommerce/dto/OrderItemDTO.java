package com.johanny.DSCommerce.dto;

import com.johanny.DSCommerce.entities.OrderItem;

public class OrderItemDTO {

    private Long productID;
    private String name;
    private  Double price;
    private Integer quantity;

    private String imgURL;

    public OrderItemDTO(Long productID, String name, Double price, Integer quantity, String imgURL) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imgURL = imgURL;
    }

    public OrderItemDTO(OrderItem entity) {
        productID = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
        imgURL = entity.getProduct().getImgUrl();
    }

    public Long getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getSubTotal(){
        return price * quantity;
    }

    public String getImgURL() {
        return imgURL;
    }
}
