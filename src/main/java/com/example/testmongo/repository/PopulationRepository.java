package com.example.testmongo.repository;

import com.example.testmongo.model.Population;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PopulationRepository extends MongoRepository<Population, String> {
}
