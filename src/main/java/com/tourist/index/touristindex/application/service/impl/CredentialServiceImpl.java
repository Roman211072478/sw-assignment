package com.tourist.index.touristindex.application.service.impl;

import com.tourist.index.touristindex.application.models.CredentialsModel;
import com.tourist.index.touristindex.application.service.CredentialService;
import com.tourist.index.touristindex.domain.repository.CredentialsRepository;
import com.tourist.index.touristindex.domain.repository.SuburbRepository;
import org.modelmapper.ModelMapper;

public class CredentialServiceImpl implements CredentialService {

    private ModelMapper modelMapper;
    private CredentialsRepository credentialsRepository;

    @Override
    public CredentialsModel create(CredentialsModel model) {
        return null;
    }

    @Override
    public void update(CredentialsModel model, long id) {

    }

    @Override
    public CredentialsModel login(String username, String password) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
