package com.amedigital.challengeramedigital.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.amedigital.challengeramedigital.domain.model.Planet;
import com.amedigital.challengeramedigital.domain.repository.PlanetRepository;

/**
 * PlanetService
 */
public class PlanetService {

  @Autowired
  private PlanetRepository planetRepository;

  public Page<Planet> findAll(Pageable pageable) {
    return planetRepository.findAll(pageable);
  }

  public Optional<Planet> findOneOrFail(final Long id) {
    return planetRepository.findById(id);
  }

}
