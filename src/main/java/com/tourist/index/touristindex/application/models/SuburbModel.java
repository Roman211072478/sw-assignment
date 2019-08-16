package com.tourist.index.touristindex.application.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuburbModel {
    //id,description,city
    private long id;

    private String description;

    private long cityId;

    public SuburbModel() {
    }
}
