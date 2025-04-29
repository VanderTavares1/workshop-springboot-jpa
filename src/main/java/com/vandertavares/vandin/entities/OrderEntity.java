package com.vandertavares.vandin.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vandertavares.vandin.enums.OrderStatusEnum;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class OrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    private Integer orderStatusEnum;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private UserEntity client;

    public OrderEntity() {
    }

    public OrderEntity(Long id, Instant moment, OrderStatusEnum orderStatusEnum, UserEntity client) {
        super();
        this.id = id;
        this.moment = moment;
        setOrderStatusEnum(orderStatusEnum);
        this.client = client;
    }

    public OrderStatusEnum getOrderStatusEnum() throws IllegalAccessException {
        return OrderStatusEnum.valueOf(orderStatusEnum);
    }

    public void setOrderStatusEnum(OrderStatusEnum orderStatusEnum) {
        if (orderStatusEnum != null) {
            this.orderStatusEnum = orderStatusEnum.getCode();
        }
    }

    public UserEntity getClient() {
        return client;
    }

    public void setClient(UserEntity client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
