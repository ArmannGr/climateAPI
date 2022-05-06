package com.example.testmongo.model;

import lombok.Data;

@Data
public class CountryEmissionTotal {
    String country;
    int year;
    long co2Total;
}
