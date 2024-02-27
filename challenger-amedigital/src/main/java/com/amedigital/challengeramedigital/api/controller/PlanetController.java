package com.amedigital.challengeramedigital.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.amedigital.challengeramedigital.api.assembler.PlanetAssembler;
import com.amedigital.challengeramedigital.api.dto.PlanetWithID;
import com.amedigital.challengeramedigital.api.dto.PlanetWithoutID;
import com.amedigital.challengeramedigital.domain.model.Planet;
import com.amedigital.challengeramedigital.domain.service.PlanetService;

@RestController
public class PlanetController {

  @Autowired
  private PlanetService planetService;

  @Autowired
  private PlanetAssembler planetAssembler;

  @GetMapping("/planets")
  public Page<PlanetWithID> getAll(
      Pageable pageable,
      @RequestParam Optional<String> search) {
      Page<Planet> planets = search
        .map(s -> planetService.findByName(pageable, s))
                                    .orElse(planetService.findAll(pageable));
        return planets.map(planet -> planetAssembler.toDto(planet));
  }

  @GetMapping("/planets/{id}")
  public ResponseEntity<PlanetWithID> getById(
      @PathVariable final Long id) {
    return planetService.findOne(id)
        .map(planet -> ResponseEntity.ok(planetAssembler.toDto(planet)))
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
            String.format("Planet with id %d not found in database", id)));
  }

  @PostMapping("/planets")
  public ResponseEntity<PlanetWithID> create(
      @RequestBody PlanetWithoutID planetIn) {
    Planet planet = planetAssembler.toEntity(planetIn);
    planet = planetService.create(planet);
    PlanetWithID planetOut = planetAssembler.toDto(planet);
    return ResponseEntity.ok(planetOut);
  }

  @DeleteMapping("/planets/{id}")
  public ResponseEntity delete(
      @PathVariable final Long id) {
    return planetService.findOne(id)
        .map(planet -> {
          planetService.delete(planet);
          return ResponseEntity.noContent().build();
        })
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
            String.format("Planet with id %d not found in database", id)));
  }

}
