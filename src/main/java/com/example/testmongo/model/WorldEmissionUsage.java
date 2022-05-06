package com.example.testmongo.model;

import lombok.Data;

@Data
public class WorldEmissionUsage {
    int year;
    long fossilFuelLandUsageEmissions;
    long landUseEmissions;
    long fossilFuelAndIndustryEmissions;
}
