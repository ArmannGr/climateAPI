package com.example.testmongo.controller;

import com.example.testmongo.model.Wetter;
import com.example.testmongo.service.WetterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WetterController {

    private final WetterService wetterService;

    public WetterController(WetterService wetterService) {
        this.wetterService = wetterService;
    }

    @PostMapping("/wetter")
    public Wetter save(@RequestBody Wetter wetter){
        return this.wetterService.getWetter(wetter);
    }

}