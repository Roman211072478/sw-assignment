package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.Suburb;
import com.tourist.index.touristindex.domain.models.User;
import org.springframework.data.repository.CrudRepository;

public interface SuburbRepository extends CrudRepository<Suburb,Long>{
}
