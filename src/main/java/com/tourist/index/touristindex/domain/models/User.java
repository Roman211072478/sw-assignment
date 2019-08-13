package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "User")
public class User {
    //    id,name,email,role
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "email" ,unique=true)
    @NotNull
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    @NotNull
    private Role role;
}
