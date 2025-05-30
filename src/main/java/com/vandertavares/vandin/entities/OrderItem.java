package com.vandertavares.vandin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vandertavares.vandin.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.aspectj.weaver.ast.Or;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantity;
    private Double price;

    Set<OrderItem> items = new HashSet<>();

    public OrderItem(){
    }

    public OrderItem(OrderEntity orderEntity, ProductEntity productEntity, Integer quantity, Double price) {
        id.setOrderEntity(orderEntity);
        id.setProductEntity(productEntity);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public OrderEntity getOrder(){
        return id.getOrderEntity();
    }

    public void setOrder(OrderEntity orderEntity){
        id.setOrderEntity(orderEntity);
    }

    public ProductEntity getProduct(){
        return id.getProductEntity();
    }

    public void setProduct(ProductEntity productEntity){
        id.setProductEntity(productEntity);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}