package com.example.testmongo.service;


import com.example.testmongo.model.Wetter;
import com.example.testmongo.model.WetterString;
import com.example.testmongo.repository.WetterRepository;
import org.springframework.stereotype.Service;

@Service
public class WetterService {

    private final WetterRepository wetterRepository;

    public WetterService(WetterRepository wetterRepository){
        this.wetterRepository = wetterRepository;
    }

    public Wetter getWetter(WetterString wetterString){
        Wetter wetter = new Wetter();
        wetter.set_id(Long.getLong(wetterString.get_id()));
        wetter.setCity("Albania");
        wetter.setTemperature(Double.parseDouble(wetterString.getTemperature()));
        wetter.setTime(wetterString.getTemperature());
        wetterRepository.save(wetter);
        return wetter;
    }
}
