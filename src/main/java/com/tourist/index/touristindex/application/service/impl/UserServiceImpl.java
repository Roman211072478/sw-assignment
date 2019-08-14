package com.tourist.index.touristindex.application.service.impl;

import com.tourist.index.touristindex.application.exceptions.UserNotFound;
import com.tourist.index.touristindex.application.models.PartialUser;
import com.tourist.index.touristindex.application.models.UserModel;
import com.tourist.index.touristindex.application.service.UserService;
import com.tourist.index.touristindex.domain.factories.UserFactory;
import com.tourist.index.touristindex.domain.models.User;
import com.tourist.index.touristindex.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;
    private UserFactory userFactory;

    @Override
    public PartialUser create(UserModel model) {

        // create if user email exist and throw error

        final User userModel = userFactory.buildEntity(model);

        final User user = userRepository.save(userModel);

        return PartialUser.builder().
                name(user.getName())
                .id(user.getId())
                .build();
    }

    @Override
    public void update(UserModel model, long id) {
        final User user = userRepository.findById(id).orElseThrow(
                UserNotFound::new
        );

        userFactory.buildUpdateModel(user,model);

    }

    @Override
    public List<UserModel> findAll() {
        final List<User> users = userRepository.findAll();

        return buildList(users);
    }
    private List<UserModel> buildList(final List<User> users){

        List<UserModel> list = new ArrayList<>();
        for (User user : users) {
            list.add(userFactory.buildModel(user));
        }

        return list;
    }

    @Override
    public UserModel findOne(final long id) {
        final User user = userRepository.findById(id).orElseThrow(
                    UserNotFound::new
            );
        return userFactory.buildModel(user);
    }

    @Override
    public void delete(long id) {
        final User user = userRepository.findById(id).orElseThrow(
                UserNotFound::new
        );
        userRepository.delete(user);
    }
}
