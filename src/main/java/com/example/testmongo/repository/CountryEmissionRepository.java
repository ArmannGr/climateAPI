package com.example.testmongo.repository;

import com.example.testmongo.model.CountryEmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CountryEmissionRepository extends JpaRepository<CountryEmission, String> {
}
