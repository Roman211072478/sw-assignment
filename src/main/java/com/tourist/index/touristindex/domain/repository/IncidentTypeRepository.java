package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.IncidentType;
import com.tourist.index.touristindex.domain.models.User;
import org.springframework.data.repository.CrudRepository;

public interface IncidentTypeRepository extends CrudRepository<IncidentType,Long>{
}
