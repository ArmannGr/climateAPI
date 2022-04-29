package com.example.testmongo.service;


import com.example.testmongo.model.Wetter;
import com.example.testmongo.repository.WetterRepository;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class WetterService {

    private final WetterRepository wetterRepository;

    public WetterService(WetterRepository wetterRepository){
        this.wetterRepository = wetterRepository;
    }

    public Wetter addWetter(Wetter wetter){
        wetterRepository.save(wetter);
        return wetter;
    }

    public void readWetterFile(String filename){
      String folder = "/Users/mauritz_langer/Downloads";
      File file = new File(folder + "/" + filename);

      if (!file.canRead() || !file.isFile())
        System.exit(0);

      BufferedReader in = null;
      try {
        in = new BufferedReader(new FileReader(file));
        String zeile = null;
        in.readLine();
        while ((zeile = in.readLine()) != null) {
          String[] splitLine = zeile.split(",");
          Wetter wetter = new Wetter();
          String[] filenameWithoutEnding = filename.split("_");
          wetter.setCountry(filenameWithoutEnding[0]);
          wetter.setTime(splitLine[0]);
          System.out.println(splitLine[1]);
          wetter.setTemperature(Double.parseDouble(splitLine[1]));
          addWetter(wetter);
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