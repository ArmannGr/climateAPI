package com.example.testmongo.service;

import com.example.testmongo.model.CountryEmissionGrowth;
import com.example.testmongo.model.Population;
import com.example.testmongo.repository.CountryEmissionGrowthRepository;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CountryEmissionGrowthService {
    private final CountryEmissionGrowthRepository countryEmissionGrowthRepository;

    public CountryEmissionGrowthService(CountryEmissionGrowthRepository countryEmissionGrowthRepository) {
        this.countryEmissionGrowthRepository = countryEmissionGrowthRepository;
    }

    public CountryEmissionGrowth addCountryEmissionGrowth(CountryEmissionGrowth countryEmissionGrowth){
        countryEmissionGrowthRepository.save(countryEmissionGrowth);
        return countryEmissionGrowth;
    }

    public void readCountryEmissionGrowthFile(String filename){
        String folder = "/Users/grewa1/Downloads";
        File file = new File(folder + "/" + filename);

        if (!file.canRead() || !file.isFile())
            System.exit(0);

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String zeile = null;
            in.readLine();
            while ((zeile = in.readLine()) != null) {
                String[] splitLine = zeile.split(";");
                CountryEmissionGrowth countryEmissionGrowth = new CountryEmissionGrowth();
                countryEmissionGrowth.setCountry(splitLine[0]);
                countryEmissionGrowth.setYear(Integer.parseInt(splitLine[1]));
                countryEmissionGrowth.setCo2Growth(Integer.parseInt(splitLine[2]));
                System.out.println(splitLine[1]);
                addCountryEmissionGrowth(countryEmissionGrowth);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                }
        }
    }
}
