package com.tourist.index.touristindex.domain.repository;

import com.tourist.index.touristindex.domain.models.Review;
import com.tourist.index.touristindex.domain.models.User;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review,Long>{
}
