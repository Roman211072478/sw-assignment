package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.City;
import com.tourist.index.touristindex.domain.models.User;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City,Long>{
}
