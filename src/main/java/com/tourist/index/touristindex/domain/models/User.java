package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "user")
public class User {
    //    id,name,email,role

    public User() {
    }

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

    @OneToMany(mappedBy = "user")
    private Set<Review> reviews;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Credentials credentials;
}
