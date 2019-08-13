package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country,Long>{
}
