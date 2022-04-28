package com.example.testmongo.service;


import com.example.testmongo.model.Wetter;
import com.example.testmongo.repository.WetterRepository;
import org.springframework.stereotype.Service;

@Service
public class WetterService {

    private final WetterRepository wetterRepository;

    public WetterService(WetterRepository wetterRepository){
        this.wetterRepository = wetterRepository;
    }

    public Wetter getWetter(Wetter wetter){
        wetterRepository.save(wetter);
        return wetter;
    }
}
