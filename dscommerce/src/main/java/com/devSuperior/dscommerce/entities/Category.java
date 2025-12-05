package com.devSuperior.dscommerce.entities;

import jakarta.persistence.ManyToMany;
import org.hibernate.annotations.ManyToAny;

import java.util.HashSet;
import java.util.Set;

public class Category {
    private Long id;
    private String name;

    public Category(){};
    @ManyToMany( mappedBy = "categories" )
    private Set<Product> products = new HashSet<>();

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
