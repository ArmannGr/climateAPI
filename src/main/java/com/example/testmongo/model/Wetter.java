package com.example.testmongo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wetter")
@Data
public class Wetter {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  double temperature;
    String country;
    String time;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
