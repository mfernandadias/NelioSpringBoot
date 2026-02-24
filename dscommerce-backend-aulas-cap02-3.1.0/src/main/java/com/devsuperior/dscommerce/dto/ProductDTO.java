package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgURL;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String imgURL, Double price, String description, String name) {
        this.id = id;
        this.imgURL = imgURL;
        this.price = price;
        this.description = description;
        this.name = name;
    }
    public ProductDTO(Product entity) {
        id = entity.getId();
        imgURL = entity.getImgUrl();
        price = entity.getPrice();
        description = entity.getDescription();
        name = entity.getName();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }


}
/*
O que é DTO?
Por que usar DTO?
Como seu código funciona linha por linha
como ele se conecta com Entity
Oq acontece na requisição POST
 */