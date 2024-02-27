package com.amedigital.challengeramedigital.api.dto;

import java.util.List;

/**
 * PlanetSwapi
 */
public record PlanetSwapi(
    String climate,
    String created,
    String diameter,
    String edited,
    List<String> films,
    String gravity,
    String name,
    String orbital_period,
    String population,
    List<String> residents,
    String rotation_period,
    String surface_water,
    String terrain,
    String url) {
}
