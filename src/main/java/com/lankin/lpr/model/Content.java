package com.lankin.lpr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name="content")
public class Content {

    public Content () {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")
    private long contentId;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "info")
    private String info;

    @NotNull
    @Column(name = "link")
    private String link;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "product_content",
            joinColumns = @JoinColumn(name = "content_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    List<Product> products;

    @JsonIgnore
    @ManyToMany(mappedBy = "contents")
    List<Category> categories;

}
