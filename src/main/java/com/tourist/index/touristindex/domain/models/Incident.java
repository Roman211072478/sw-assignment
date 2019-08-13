package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "incident")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    @NotNull
    private String description;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn
    private IncidentType incidentType;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn
    private Suburb suburb;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn
    private User user;

}
