package com.tourist.index.touristindex.application.service;

import com.tourist.index.touristindex.application.models.PartialUser;
import com.tourist.index.touristindex.application.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    PartialUser create(final UserModel model);
    void update(final UserModel model,final long id);

    List<UserModel> findAll();

    UserModel findOne(long id);

    void delete(long id);
}
