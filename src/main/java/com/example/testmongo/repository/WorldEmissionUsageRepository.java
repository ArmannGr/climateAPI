package com.example.testmongo.repository;

import com.example.testmongo.model.WorldEmissionUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WorldEmissionUsageRepository extends JpaRepository<WorldEmissionUsage, String> {
}
