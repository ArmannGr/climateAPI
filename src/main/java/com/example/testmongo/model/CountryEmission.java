package com.example.testmongo.model;

import lombok.Data;

@Data
public class CountryEmission {
    String country;
    int year;
    long co2;
}
