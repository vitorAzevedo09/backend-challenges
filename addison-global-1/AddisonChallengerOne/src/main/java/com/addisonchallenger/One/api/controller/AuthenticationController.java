package com.addisonchallenger.One.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
class AuthenticationController {

  @RequestMapping("/authenticate")
  public String authenticate() {
    return "Hello, World!";
  }
}
