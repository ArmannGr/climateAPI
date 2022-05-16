package com.example.testmongo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "worldEmissionUsage")
@Data
public class WorldEmissionUsage {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  int year;
    long fossilFuelLandUsageEmissions;
    long landUseEmissions;
    long fossilFuelAndIndustryEmissions;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
