package com.ravi.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.flightreservation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
