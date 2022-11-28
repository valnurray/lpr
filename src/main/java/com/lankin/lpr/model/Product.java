package com.lankin.lpr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name="product")
public class Product {

    public Product(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "visibility")
    private String visibility;

    @NotNull
    @Column(name = "price")
    private BigDecimal price;

    @NotNull
    @Column(name = "info")
    private String info;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ProductMembers> productMembers;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderField> orderFields;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy = "products")
    List<Content> contents;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy = "products")
    List<Category> categories;

}
