package com.lankin.lpr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name="bascet")
public class Bascet {

    public Bascet(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bascet_id")
    private long bascetId;

    @NotNull
    @Column(name = "count_orders")
    private int countOrders;

    @NotNull
    @Column(name = "total_orders_price")
    private BigDecimal totalOrderPrice;

    @JsonIgnore
    @OneToMany(mappedBy = "bascet", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderField> orderFields;

}
