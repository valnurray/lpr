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
import java.util.List;

@Data
@Entity
@Table(name="roles")
public class Role {

    public Role(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roles_id")
    private long rolesId;

    @NotNull
    @Column(name = "roles")
    private String roles;

    @JsonIgnore
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<User> users;

}
