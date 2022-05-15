package com.example.testmongo.repository;

import com.example.testmongo.model.CountryEmissionTotal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CountryEmissionTotalRepository extends JpaRepository<CountryEmissionTotal, String> {
}
