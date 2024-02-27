package com.amedigital.challengeramedigital.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amedigital.challengeramedigital.api.dto.SwapiListPlanets;

/**
 * SwapiService
 */
@Service
public class SwapiService {

  @Autowired
  private RestTemplate restTemplate;

  public Integer getFilmAppearancesSwapiByName(final String name) {
    String url = "https://swapi.dev/api/planets/?search=" + name;
    SwapiListPlanets planetList = restTemplate.getForObject(url, SwapiListPlanets.class);
    return planetList.results().get(0).films().size();
  }

}
