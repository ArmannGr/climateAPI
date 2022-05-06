package com.example.testmongo.model;

import lombok.Data;

@Data
public class WorldEmissionUsage {
    int year;
    String fossilFuelLandUsageEmissions;
    String landUseEmissions;
    String fossilFuelAndIndustryEmissions;
}
