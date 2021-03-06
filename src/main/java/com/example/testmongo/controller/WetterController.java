package com.example.testmongo.controller;

import com.example.testmongo.model.Wetter;
import com.example.testmongo.service.CountryEmissionGrowthService;
import com.example.testmongo.service.PopulationService;
import com.example.testmongo.service.WetterService;
import com.example.testmongo.service.WorldEmissionUsageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WetterController {

    private final WetterService wetterService;
    private final PopulationService populationService;
    private final CountryEmissionGrowthService countryEmissionGrowthService;
    private final WorldEmissionUsageService worldEmissionUsageService;


    public WetterController(WetterService wetterService, PopulationService populationService,
                            CountryEmissionGrowthService countryEmissionGrowthService,
                            WorldEmissionUsageService worldEmissionUsageService) {
        this.wetterService = wetterService;
        this.populationService = populationService;
        this.countryEmissionGrowthService = countryEmissionGrowthService;
        this.worldEmissionUsageService = worldEmissionUsageService;
    }

    @PostMapping("/setWetter")
    public Wetter save(@RequestBody Wetter wetter){
        return this.wetterService.addWetter(wetter);
    }

  @GetMapping("/importToDB")
  public String importToDB(){
    String folder = "/Users/mauritz_langer/Documents/Test";
    this.wetterService.readFolder(folder);
    return "Success";
  }

  @GetMapping("/population/importToDB")
    public String populationImportToDB(){
        this.populationService.readPopulationFile("UN_BOTH_SEXES_1950_to_2020_2.csv");
        return "Success";
  }

    @GetMapping("/countryEmissionGrowth/importToDB")
    public String countryEmissionGrowthImportToDB(){
        this.countryEmissionGrowthService.readCountryEmissionGrowthFile("ANNUAL_CO2_CHANGE_PERCENT_FINAL.CSV");
        return "Success";
    }

    @GetMapping("/worldEmissionUsageRepository/importToDB")
    public String worldEmissionUsageRepositoryImportToDB(){
        this.worldEmissionUsageService.readWorldEmissionUsageFile("ANNUAL_CO2_LAND_INDUSTRY_FINAL.CSV");
        return "Success";
    }

}
