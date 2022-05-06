package com.example.testmongo.repository;

import com.example.testmongo.model.WorldEmissionUsage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorldEmissionUsageRepository extends MongoRepository<WorldEmissionUsage, String> {
}
