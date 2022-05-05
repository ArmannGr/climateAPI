package com.example.testmongo.service;


import com.example.testmongo.model.Wetter;
import com.example.testmongo.repository.WetterRepository;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class WetterService {

    private final WetterRepository wetterRepository;

    public WetterService(WetterRepository wetterRepository){
        this.wetterRepository = wetterRepository;
    }

    public List<Wetter> addWetterList(List<Wetter> wetterList){
        wetterRepository.insert(wetterList);
        return wetterList;
    }

  public Wetter addWetter(Wetter wetter){
    wetterRepository.save(wetter);
    return wetter;
  }

    public void readWetterFile(String filename){
      System.out.println(LocalDateTime.now());
      String folder = "/Users/mauritz_langer/Downloads";
      File file = new File(folder + "/" + filename);

      if (!file.canRead() || !file.isFile())
        System.exit(0);

      BufferedReader in = null;
      try {
        in = new BufferedReader(new FileReader(file));
        String zeile = null;
        in.readLine();
        int i = 0;
        List<Wetter> wetterList = new ArrayList<>();
        String[] filenameWithoutEnding;
        if (filename.contains("_")) {
          filenameWithoutEnding = filename.split("_");
        } else {
          filenameWithoutEnding = filename.split("\\.");
        }
        while ((zeile = in.readLine()) != null) {
          i++;
          String[] splitLine = zeile.split(",");
          Wetter wetter = new Wetter();
          wetter.setCountry(filenameWithoutEnding[0]);
          wetter.setTime(splitLine[0]);
          //System.out.println(splitLine[1]);
          wetter.setTemperature(Double.parseDouble(splitLine[1]));
          wetterList.add(wetter);
          if (i == 10000){
            addWetterList(wetterList);
            wetterList.clear();
            i = 0;
          }
        }
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        System.out.println(LocalDateTime.now());
        if (in != null)
          try {
            in.close();
          } catch (IOException e) {
          }
      }
    }
}
