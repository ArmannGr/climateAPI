package com.example.testmongo.repository;

import com.example.testmongo.model.Wetter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WetterRepository extends MongoRepository<Wetter, String> {

}
