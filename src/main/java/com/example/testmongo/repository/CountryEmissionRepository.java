package com.example.testmongo.repository;

import com.example.testmongo.model.CountryEmission;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryEmissionRepository extends MongoRepository<CountryEmission, String> {
}
