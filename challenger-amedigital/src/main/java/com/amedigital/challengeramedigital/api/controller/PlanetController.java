package com.amedigital.challengeramedigital.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
