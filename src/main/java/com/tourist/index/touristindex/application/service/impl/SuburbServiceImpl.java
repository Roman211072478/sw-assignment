package com.tourist.index.touristindex.application.service.impl;

import com.tourist.index.touristindex.application.exceptions.SuburbNotFound;
import com.tourist.index.touristindex.application.models.SuburbModel;
import com.tourist.index.touristindex.application.models.UserModel;
import com.tourist.index.touristindex.application.service.SuburbService;
import com.tourist.index.touristindex.domain.factories.UserFactory;
import com.tourist.index.touristindex.domain.models.Suburb;
import com.tourist.index.touristindex.domain.models.User;
import com.tourist.index.touristindex.domain.repository.SuburbRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class SuburbServiceImpl implements SuburbService {

    private ModelMapper modelMapper;
    private SuburbRepository suburbRepository;

    @Override
    public SuburbModel create(SuburbModel model) {

        Suburb sub = new Suburb();
//        sub.setCity(model.getCity().getId())
//        sub.setDescription(model.getDescription())
//        sub.setId(model.getId())
//                .build();

        final Suburb entity = suburbRepository.save(sub);

        return  SuburbModel.builder()
                .cityId(entity.getCity().getId())
                .description(entity.getDescription())
                .id(entity.getId())
                .build();
    }

    @Override
    public void update(SuburbModel model, long id) {
        final Suburb suburb = suburbRepository.findById(id).orElseThrow(
                SuburbNotFound::new
        );

        modelMapper.map(model,suburb);
    }

    @Override
    public List<SuburbModel> findAll() {
        return null;
    }

    @Override
    public List<SuburbModel> findByCityId(final long id) {


        final List<Suburb> suburbs = suburbRepository.findAllByCityId(id).orElseThrow(
                SuburbNotFound::new
        );

        return buildList(suburbs);
    }

    private List<SuburbModel> buildList(final List<Suburb> entities){

        List<SuburbModel> list = new ArrayList<>();

        for (Suburb item : entities) {
            SuburbModel suburb = SuburbModel.builder()
                    .cityId(item.getCity().getId())
                    .description(item.getDescription())
                    .id(item.getId())
                    .build();

            list.add(suburb);
        }


        return list;
    }

    @Override
    public SuburbModel findOne(long id) {
        final Suburb suburb = suburbRepository.findById(id).orElseThrow(
                SuburbNotFound::new
        );

        return  SuburbModel.builder()
                .cityId(suburb.getCity().getId())
                .description(suburb.getDescription())
                .id(suburb.getId())
                .build();
    }

    @Override
    public void delete(long id) {
        final Suburb suburb = suburbRepository.findById(id).orElseThrow(
                SuburbNotFound::new
        );

        suburbRepository.delete(suburb);
    }
}
