package com.tourist.index.touristindex.domain.models;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "comment")
    @NotNull
    private String comment;

    @Column(name = "reviewDate")
    @NotNull
    private Instant reviewDate;

    @Column(name = "rating")
    @NotNull
    private int rating;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn
    private Suburb suburb;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn
    private User user;
}
