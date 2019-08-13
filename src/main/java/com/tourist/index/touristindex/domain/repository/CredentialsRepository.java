package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.Credentials;
import com.tourist.index.touristindex.domain.models.User;
import org.springframework.data.repository.CrudRepository;

public interface CredentialsRepository extends CrudRepository<Credentials,Long>{
}
