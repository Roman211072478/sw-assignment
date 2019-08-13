package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "City")
public class City {
    //id,description.province
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    @NotNull
    private String description;

    @OneToMany
    @JoinColumn(name="province_id")
    private List<Province> province;
}
