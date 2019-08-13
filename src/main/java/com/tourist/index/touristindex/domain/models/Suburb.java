package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Suburb")
public class Suburb {
    //id,description,city
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    @NotNull
    private String description;

    @OneToMany
    @JoinColumn(name="city_id")
    private List<City> city;
}
