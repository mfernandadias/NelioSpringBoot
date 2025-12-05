package com.devSuperior.dscommerce.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

public class OrderItemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderItemPK(){}

    public OrderItemPK(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // IMPORTANTE: equals e hashCode
    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        OrderItemPK that = (OrderItemPK) obj;
        return Objects.equals(order, that.order)
                && Objects.equals(product, that.product);
    }

}
