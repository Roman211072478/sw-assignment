package com.tourist.index.touristindex.application.service;

import com.tourist.index.touristindex.application.models.CredentialsModel;
import com.tourist.index.touristindex.application.models.PartialUser;
import com.tourist.index.touristindex.application.models.UserModel;

import java.util.List;

public interface CredentialService {

    CredentialsModel create(final CredentialsModel model);

    void update(final CredentialsModel model, final long id);

    CredentialsModel login(final String username,final String password);

    void delete(long id);
}
