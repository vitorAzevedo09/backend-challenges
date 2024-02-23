package com.amedigital.challengeramedigital.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Planet
 */
@Entity(name = "planets")
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
  private Integer filmAppearances = 0;

}
