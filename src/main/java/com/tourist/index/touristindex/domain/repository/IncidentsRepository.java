package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.Incident;
import com.tourist.index.touristindex.domain.models.User;
import org.springframework.data.repository.CrudRepository;

public interface IncidentsRepository extends CrudRepository<Incident,Long>{
}
