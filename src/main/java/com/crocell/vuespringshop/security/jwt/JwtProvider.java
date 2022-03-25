package com.crocell.vuespringshop.security.jwt;

import com.crocell.vuespringshop.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {

  String generateToken(UserPrincipal auth);

  boolean isTokenValid(HttpServletRequest httpServletRequest);

  Authentication getAuthentication(HttpServletRequest httpServletRequest);
}
