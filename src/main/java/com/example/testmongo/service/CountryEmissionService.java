package com.example.testmongo.service;

import com.example.testmongo.repository.CountryEmissionRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryEmissionService {
    private final CountryEmissionRepository countryEmissionRepository;

    public CountryEmissionService(CountryEmissionRepository countryEmissionRepository) {
        this.countryEmissionRepository = countryEmissionRepository;
    }
}
