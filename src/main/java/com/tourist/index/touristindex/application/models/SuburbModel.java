package com.tourist.index.touristindex.application.models;

import lombok.Builder;

@Builder
public class SuburbModel {
    //id,description,city
    private long id;

    private String description;

    private long cityId;
}
