package com.example.testmongo.model;

import lombok.Data;

@Data
public class Wetter {
    long _id;
    double temperature;
    String city;
    String time;
}
