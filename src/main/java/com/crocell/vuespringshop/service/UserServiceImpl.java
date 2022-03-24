package com.crocell.vuespringshop.service;

import com.crocell.vuespringshop.model.Role;
import com.crocell.vuespringshop.model.User;
import com.crocell.vuespringshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){

        return userRepository.save(
                User.builder()
                .password(passwordEncoder.encode(user.getPassword()))
                .role(Role.USER)
                .createTime(LocalDateTime.now())
                .build()
        );
    }

    @Override
    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional //Transactional is only required when executing update queries
    public void changeRole(Role newRole, String username){
        userRepository.updateUserRole(username, newRole);
    }
}
