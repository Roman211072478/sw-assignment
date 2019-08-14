package com.tourist.index.touristindex.application.models;

import lombok.Builder;

@Builder
public class ProvinceModel {
    //id,description,country
    private long id;

    private String description;

    private long countryId;
}
