package com.example.testmongo.repository;

import com.example.testmongo.model.CountryEmissionGrowth;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryEmissionGrowthRepository extends MongoRepository<CountryEmissionGrowth, String> {
}
