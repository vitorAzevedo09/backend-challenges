package com.amedigital.challengeramedigital.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetController {

  @GetMapping("/teste")
  public ResponseEntity<String> test() {
    return ResponseEntity.ok("OK");
  }

}
