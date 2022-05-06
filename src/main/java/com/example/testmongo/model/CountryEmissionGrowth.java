package com.example.testmongo.model;

import lombok.Data;

@Data
public class CountryEmissionGrowth {
    String country;
    int year;
    int co2Growth;
}
