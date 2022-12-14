package com.crocell.vuespringshop.controller;

import com.crocell.vuespringshop.model.User;
import com.crocell.vuespringshop.service.AuthenticationService;
import com.crocell.vuespringshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/authentication") //pre-path
public class AuthenticationController {

  private final AuthenticationService authenticationService;
  private final UserService userService;

  @PostMapping("sign-up") //will look like api/authentication/sign-up
  public ResponseEntity<?> signUp (@RequestBody User user){
    if(userService.findByUsername(user.getUsername()).isPresent()){
      return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
  }

  @PostMapping("sign-in") //will look like api/authentication/sign-in
  public ResponseEntity<?> signIn (@RequestBody User user){
    return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);
  }

}
