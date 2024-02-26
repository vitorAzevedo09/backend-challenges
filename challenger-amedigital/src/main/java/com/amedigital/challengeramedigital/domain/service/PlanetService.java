package com.amedigital.challengeramedigital.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.amedigital.challengeramedigital.domain.model.Planet;
import com.amedigital.challengeramedigital.domain.repository.PlanetRepository;

/**
 * PlanetService
 */
@Service
public class PlanetService {

  @Autowired
  private PlanetRepository planetRepository;

  public Page<Planet> findAll(Pageable pageable) {
    return planetRepository.findAll(pageable);
  }

  public Optional<Planet> findOne(final Long id) {
    return planetRepository.findById(id);
  }

  public Page<Planet> findByName(Pageable pageable, final String name) {
    return planetRepository.findByName(pageable, name);
  }

  public Planet create(Planet planetIn) {
    return planetRepository.save(planetIn);
  }

  public void delete(Planet planet) {
    planetRepository.delete(planet);
  }

}
