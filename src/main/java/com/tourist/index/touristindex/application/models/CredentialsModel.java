package com.tourist.index.touristindex.application.models;

import lombok.Builder;

import javax.validation.Valid;

@Builder
public class CredentialsModel {

    private long id;

    private String username;

    private String password;

    private long userId;
}
