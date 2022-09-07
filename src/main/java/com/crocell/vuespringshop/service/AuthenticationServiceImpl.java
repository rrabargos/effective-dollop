package com.crocell.vuespringshop.service;

import com.crocell.vuespringshop.model.User;
import com.crocell.vuespringshop.security.UserPrincipal;
import com.crocell.vuespringshop.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService{

  private final AuthenticationManager authenticationManager;

  private final JwtProvider jwtProvider;

  @Override
  public User signInAndReturnJWT(User signInRequest){
    Authentication authentication = authenticationManager.authenticate(
      new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword())
    );

    UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
    String jwt = jwtProvider.generateToken(userPrincipal);

    User signInUser = userPrincipal.getUser();
    signInUser.setToken(jwt);

    return signInUser;
  }
}
