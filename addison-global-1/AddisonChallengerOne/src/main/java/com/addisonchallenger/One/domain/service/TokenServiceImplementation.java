package com.addisonchallenger.One.domain.service;

import java.util.concurrent.CompletableFuture;

import com.addisonchallenger.One.domain.model.Credentials;
import com.addisonchallenger.One.domain.model.UserToken;

public class TokenServiceImplementation {

  CompletableFuture<UserToken> requestToken(Credentials credentials) {
    return CompletableFuture.completedFuture(new UserToken("token"));
  }

}
