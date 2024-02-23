package com.amedigital.challengeramedigital.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amedigital.challengeramedigital.domain.model.Planet;

/**
 * PlanetRepository
 */
@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
