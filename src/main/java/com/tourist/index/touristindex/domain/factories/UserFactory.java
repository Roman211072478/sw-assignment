package com.tourist.index.touristindex.domain.factories;

import com.tourist.index.touristindex.application.models.UserModel;
import com.tourist.index.touristindex.domain.models.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserFactory {

    private ModelMapper mapper;

    public User buildEntity(final UserModel model){
         User entity = new User();
        entity.setEmail(model.getEmail());
        entity.setRole(model.getRole());
        entity.setName(model.getName());
        return entity;
    }

    public UserModel buildModel(final User model){
        return UserModel.builder()
                .email(model.getEmail())
                .role(model.getRole())
                .name(model.getName())
                .id(model.getId())
                .build();
    }
    public void buildUpdateModel(final User entity,final UserModel model){
        mapper.map(model,entity);
    }
}
