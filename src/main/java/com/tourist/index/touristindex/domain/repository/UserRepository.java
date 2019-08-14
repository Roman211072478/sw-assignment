package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
