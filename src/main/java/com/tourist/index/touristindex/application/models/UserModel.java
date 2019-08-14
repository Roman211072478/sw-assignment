package com.tourist.index.touristindex.application.models;

import com.tourist.index.touristindex.domain.models.Role;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class UserModel {
    //    id,name,email,role

    private long id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private Role role;
}
