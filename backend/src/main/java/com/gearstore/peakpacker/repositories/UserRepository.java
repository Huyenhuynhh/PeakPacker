package com.gearstore.peakpacker.repositories;

import java.util.Optional;

import com.gearstore.peakpacker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gearstore.peakpacker.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);

    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}

