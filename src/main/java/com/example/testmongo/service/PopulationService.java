package com.example.testmongo.service;

import com.example.testmongo.model.Population;
import com.example.testmongo.repository.PopulationRepository;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class PopulationService {

    private final PopulationRepository populationRepository;

    public PopulationService(PopulationRepository populationRepository) {
        this.populationRepository = populationRepository;
    }

    public Population addPopulation(Population population){
        populationRepository.save(population);
        return population;
    }

    public void readPopulationFile(String filename){
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
                Population population = new Population();
                population.setCountry(splitLine[0]);
                population.setYear(Integer.parseInt(splitLine[1]));
                population.setValue(Integer.parseInt(splitLine[2]));
                System.out.println(splitLine[1]);
                addPopulation(population);
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
