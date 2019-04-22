package com.ravi.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.flightreservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
