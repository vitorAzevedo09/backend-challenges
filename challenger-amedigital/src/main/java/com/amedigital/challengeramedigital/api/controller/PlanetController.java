package com.amedigital.challengeramedigital.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.amedigital.challengeramedigital.api.assembler.PlanetAssembler;
import com.amedigital.challengeramedigital.api.dto.PlanetWithID;
import com.amedigital.challengeramedigital.domain.service.PlanetService;

@RestController
public class PlanetController {

  @Autowired
  private PlanetService planetService;

  @Autowired
  private PlanetAssembler planetAssembler;

  @GetMapping("/planets")
  public Page<PlanetWithID> getAll(Pageable pageable) {
    return planetService.findAll(pageable)
        .map(planet -> planetAssembler.toDto(planet));
  }

  @GetMapping("/planets/{id}")
  public ResponseEntity<PlanetWithID> getOne(
      @PathVariable final Long id) {
    return planetService.findOne(id)
        .map(planet -> ResponseEntity.ok(planetAssembler.toDto(planet)))
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
            String.format("Planet with id %d not found in database", id)));
  }
}
