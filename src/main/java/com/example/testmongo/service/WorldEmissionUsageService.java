package com.example.testmongo.service;

import com.example.testmongo.model.WorldEmissionUsage;
import com.example.testmongo.repository.WorldEmissionUsageRepository;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class WorldEmissionUsageService {
    private final WorldEmissionUsageRepository worldEmissionUsageRepository;

    public WorldEmissionUsageService(WorldEmissionUsageRepository worldEmissionUsageRepository) {
        this.worldEmissionUsageRepository = worldEmissionUsageRepository;
    }

    public void addWorldEmissionUsage(WorldEmissionUsage worldEmissionUsage){
        worldEmissionUsageRepository.save(worldEmissionUsage);
    }

    public void readWorldEmissionUsageFile(String filename){
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
                WorldEmissionUsage worldEmissionUsage = new WorldEmissionUsage();
                worldEmissionUsage.setYear(Integer.parseInt(splitLine[1]));
                worldEmissionUsage.setFossilFuelLandUsageEmissions((splitLine[2]));
                worldEmissionUsage.setLandUseEmissions((splitLine[3]));
                worldEmissionUsage.setFossilFuelAndIndustryEmissions((splitLine[4]));
                System.out.println(splitLine[1] +  " "+ splitLine[2] + " "+  splitLine[3] + " " + splitLine[3]);
                addWorldEmissionUsage(worldEmissionUsage);
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
