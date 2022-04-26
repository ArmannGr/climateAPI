package com.example.testmongo.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WetterController {

    private final WetterRepository wetterRepository;

    public WetterController(WetterRepository wetterRepository){
        this.wetterRepository = wetterRepository;
    }

    @PostMapping("/wetter")
    public void save(@RequestBody Wetter wetter){
        wetterRepository.save(wetter);

    }

}
