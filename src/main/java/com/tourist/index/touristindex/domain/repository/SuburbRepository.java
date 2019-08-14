package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.Suburb;
import com.tourist.index.touristindex.domain.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface SuburbRepository extends CrudRepository<Suburb,Long>{

    Optional<List<Suburb>> findAllByCityId(final long id);
}
