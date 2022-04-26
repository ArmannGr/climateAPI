package com.example.testmongo.test;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WetterRepository extends MongoRepository<Wetter, String> {

}
