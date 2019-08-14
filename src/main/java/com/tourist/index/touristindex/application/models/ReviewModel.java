package com.tourist.index.touristindex.application.models;

import lombok.Builder;

import java.time.Instant;

@Builder
public class ReviewModel {

    private long id;

    private String comment;

    private Instant reviewDate;

    private int rating;

    private long suburbId;

    private long userId;
}
