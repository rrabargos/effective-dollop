package com.crocell.vuespringshop.service;

import com.crocell.vuespringshop.model.User;

public interface AuthenticationService {
  User signInAndReturnJWT(User signInRequest);
}
