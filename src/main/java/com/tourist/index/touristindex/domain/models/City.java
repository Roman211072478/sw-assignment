package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "city")
public class City {
    //id,description.province
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn
    private Province province;

    @OneToMany(mappedBy = "city")
    private Set<Suburb> Suburb;
}