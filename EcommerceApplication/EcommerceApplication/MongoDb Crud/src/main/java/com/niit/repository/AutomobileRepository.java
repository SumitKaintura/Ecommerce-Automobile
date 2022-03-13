package com.niit.repository;

import com.niit.domain.Automobile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AutomobileRepository extends MongoRepository<Automobile,Integer> {
}
