package com.example.testmongo.repository;

import com.example.testmongo.model.CountryEmissionGrowth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CountryEmissionGrowthRepository extends JpaRepository<CountryEmissionGrowth, String> {
}
