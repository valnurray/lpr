package com.lankin.lpr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name="orderfield")
public class OrderField {

    public OrderField () {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long orderInt;

    @NotNull
    @Column(name = "time_order")
    private Date timeOrder;

    @NotNull
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne()
    @JoinColumn(name = "bascet_id")
    private Bascet bascet;

}
