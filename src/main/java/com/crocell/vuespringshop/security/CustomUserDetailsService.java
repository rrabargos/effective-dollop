package com.crocell.vuespringshop.security;

import com.crocell.vuespringshop.model.User;
import com.crocell.vuespringshop.service.UserService;
import com.crocell.vuespringshop.utils.SecurityUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

  private final UserService userService;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userService.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException(username));

    Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));

    return UserPrincipal.builder()
            .user(user)
            .id(user.getId())
            .username(username)
            .password(user.getPassword())
            .authorities(authorities)
            .build();
  }
}
