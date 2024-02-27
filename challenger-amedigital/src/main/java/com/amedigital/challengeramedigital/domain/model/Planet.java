package com.amedigital.challengeramedigital.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a planet in a fictional universe.
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
  private String climate;

  @Column
  private String terrain;

  @Column
  private Integer filmAppearances = 0;

  // Private constructor to prevent instantiation outside the builder
  private Planet() {
  }

  /**
   * Returns the unique identifier of the planet.
   * 
   * @return the unique identifier of the planet.
   */
  public Long getID() {
    return ID;
  }

  /**
   * Returns the name of the planet.
   * 
   * @return the name of the planet.
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the climate of the planet.
   * 
   * @return the climate of the planet.
   */
  public String getClimate() {
    return climate;
  }

  /**
   * Returns the terrain of the planet.
   * 
   * @return the terrain of the planet.
   */
  public String getTerrain() {
    return terrain;
  }

  /**
   * Returns the number of film appearances of the planet in the fictional
   * universe.
   * 
   * @return the number of film appearances of the planet.
   */
  public Integer getFilmAppearances() {
    return filmAppearances;
  }

  // Builder class
  /**
   * A builder for constructing {@link Planet} objects.
   */
  public static class Builder {
    private String name;
    private String climate;
    private String terrain;
    private Integer filmAppearances;

    /**
     * Sets the name of the planet.
     * 
     * @param name the name of the planet.
     * @return the builder instance.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Sets the climate of the planet.
     * 
     * @param climate the climate of the planet.
     * @return the builder instance.
     */
    public Builder climate(String climate) {
      this.climate = climate;
      return this;
    }

    /**
     * Sets the terrain of the planet.
     * 
     * @param terrain the terrain of the planet.
     * @return the builder instance.
     */
    public Builder terrain(String terrain) {
      this.terrain = terrain;
      return this;
    }

    /**
     * Sets the number of film appearances of the planet.
     * 
     * @param filmAppearances the number of film appearances of the planet.
     * @return the builder instance.
     */
    public Builder filmAppearances(Integer filmAppearances) {
      this.filmAppearances = filmAppearances;
      return this;
    }

    /**
     * Constructs a new {@link Planet} object with the provided attributes.
     * 
     * @return the constructed {@link Planet} object.
     */
    public Planet build() {
      Planet planet = new Planet();
      planet.name = this.name;
      planet.climate = this.climate;
      planet.terrain = this.terrain;
      planet.filmAppearances = this.filmAppearances;
      return planet;
    }
  }

  public void changeFilmAppearances(Integer filmAppearances) {
    this.filmAppearances = filmAppearances;
  }

}
