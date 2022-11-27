package com.lankin.lpr.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="users")
public class User {

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @NotNull
    @Column(name = "login")
    private String login;

    @NotNull
    @Column(name = "credentials")
    private String credentials;

    @NotNull
    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthday")
    private Date birthday;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "roles_id")
    private Role role;

    @OneToMany (mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ProductMembers> productMembers;

    @OneToMany (mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderField> orderFields;

}
