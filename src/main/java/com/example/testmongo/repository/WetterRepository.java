package com.example.testmongo.repository;

import com.example.testmongo.model.Wetter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WetterRepository extends JpaRepository<Wetter, String> {

}
