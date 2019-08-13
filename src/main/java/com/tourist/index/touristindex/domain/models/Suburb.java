package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "suburb")
public class Suburb {
    //id,description,city
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn
    private City city;

    @OneToMany(mappedBy = "suburb")
    private Set<Incident> incidents;

    @OneToMany(mappedBy = "suburb")
    private Set<Review> reviews;


}
