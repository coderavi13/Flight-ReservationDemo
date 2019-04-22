package com.ravi.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.flightreservation.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
