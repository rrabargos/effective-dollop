package com.crocell.vuespringshop.controller;

import com.crocell.vuespringshop.model.Role;
import com.crocell.vuespringshop.security.UserPrincipal;
import com.crocell.vuespringshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

  private final UserService userService;

  @PutMapping("change/{role}")
  public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role){
    userService.changeRole(role, userPrincipal.getUsername());
    return ResponseEntity.ok(true);
  }
}
