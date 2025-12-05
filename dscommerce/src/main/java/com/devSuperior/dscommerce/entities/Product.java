package com.devSuperior.dscommerce.entities;

import java.util.HashSet;
import java.util.Set;

public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public Product(){}

    private Set<Category> categories = new HashSet<>();

    public Product(Long id, String imgUrl, Double price, String description, String name) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.price = price;
        this.description = description;
        this.name = name;
    }
}
