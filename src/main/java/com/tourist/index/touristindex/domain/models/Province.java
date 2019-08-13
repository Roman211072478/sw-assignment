package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

//

@Data
@Entity
@Table(name = "province")
public class Province {
    //id,description,country
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    @NotNull
    private String description;

    @OneToMany(mappedBy = "province")
    private Set<City> cities;

    @ManyToOne
    @JoinColumn
    private Country country;
}
