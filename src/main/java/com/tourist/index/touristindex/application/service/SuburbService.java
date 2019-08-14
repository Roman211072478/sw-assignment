package com.tourist.index.touristindex.application.service;

import com.tourist.index.touristindex.application.models.SuburbModel;

import java.util.List;

public interface SuburbService {

    SuburbModel create(final SuburbModel model);

    void update(final SuburbModel model,final long id);

    List<SuburbModel> findAll();

    List<SuburbModel> findByCityId(final long id);

    SuburbModel findOne(final long id);//NOPMD

    void delete(long id);//NOPMD
}
