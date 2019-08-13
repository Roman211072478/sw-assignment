package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Country")
public class Country {
    //id,description
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    @NotNull
    private String description;
}
