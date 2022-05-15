package com.example.testmongo.repository;

import com.example.testmongo.model.Population;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PopulationRepository extends JpaRepository<Population, String> {
}
