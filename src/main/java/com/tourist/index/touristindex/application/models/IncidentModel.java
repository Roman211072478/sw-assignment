package com.tourist.index.touristindex.application.models;

import lombok.Builder;


@Builder
public class IncidentModel {

    private long id;

    private String description;

    private long incidentTypeId;

    private long suburbId;

    private long userId;
}
