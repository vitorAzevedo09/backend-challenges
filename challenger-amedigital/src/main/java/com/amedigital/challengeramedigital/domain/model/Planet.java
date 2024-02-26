package com.amedigital.challengeramedigital.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Planet
 */
@Entity
public class Planet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long ID;

  @Column
  private String name;

  @Column
  private String weather;

  @Column
  private String terrain;

  @Column
  private final Integer filmAppearances = 0;

  public Long getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public String getWeather() {
    return weather;
  }

  public String getTerrain() {
    return terrain;
  }

  public Integer getFilmAppearances() {
    return filmAppearances;
  }

}
