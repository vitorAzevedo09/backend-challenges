package com.amedigital.challengeramedigital.api.dto;

/**
 * Represents a planet without its unique identifier.
 * Includes information such as the planet's name, climate, terrain, and number
 * of film appearances in the Star Wars franchise.
 *
 * @param name            The name of the planet.
 * @param climate         The climate of the planet.
 * @param terrain         The terrain of the planet.
 * @param filmAppearances The number of appearances of the planet in Star Wars
 *                        films.
 */
public record PlanetWithoutID(
    String name,
    String climate,
    String terrain,
    Integer filmAppearances) {
}
