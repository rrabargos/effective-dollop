package com.crocell.vuespringshop.repository;

import com.crocell.vuespringshop.model.Role;
import com.crocell.vuespringshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //findby + fieldName
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("UPDATE user SET role = :role where username = :username")
    void updateUserRole(@Param("Username") String username, @Param("role") Role role);
}
