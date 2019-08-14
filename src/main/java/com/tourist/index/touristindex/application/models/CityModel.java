package com.tourist.index.touristindex.application.models;

import com.sun.istack.internal.NotNull;
import lombok.Builder;

@Builder
public class CityModel {
    //id,description.province
    private long id;

    private String description;

    private long provinceId;

}