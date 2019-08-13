package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "credentials")
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username", unique=true)
    @NotNull
    private String username;

    @Column(name = "password")
    @NotNull
    private String password;

    @OneToOne(optional = false)
    @NotNull
    @JoinColumn
    private User user;
}
