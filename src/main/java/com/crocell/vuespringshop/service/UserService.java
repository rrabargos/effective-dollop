package com.crocell.vuespringshop.service;

import com.crocell.vuespringshop.model.Role;
import com.crocell.vuespringshop.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserService {


    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
