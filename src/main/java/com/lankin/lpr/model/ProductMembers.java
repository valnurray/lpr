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
import java.util.Date;

@Data
@Entity
@Table(name="productMembers")
public class ProductMembers {

    public ProductMembers(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_members_id")
    private long productMembersId;

    @NotNull
    @Column(name = "order_time")
    private Date orderTime;

    @ManyToOne()
//    @JsonIgnore
    @ToString.Exclude
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne()
    @JsonIgnore
    @ToString.Exclude
    @JoinColumn(name = "user_id")
    private User user;

}
