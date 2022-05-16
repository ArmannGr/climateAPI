package com.example.testmongo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "population")
@Data
public class Population {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  String country;
    int year;
    int value;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
