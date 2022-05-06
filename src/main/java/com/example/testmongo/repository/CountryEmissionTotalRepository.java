package com.example.testmongo.repository;

import com.example.testmongo.model.CountryEmissionTotal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryEmissionTotalRepository extends MongoRepository<CountryEmissionTotal, String> {
}
