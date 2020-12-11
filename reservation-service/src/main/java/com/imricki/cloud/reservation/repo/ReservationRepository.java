package com.imricki.cloud.reservation.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.imricki.cloud.reservation.entity.Reservation;

@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	Collection<Reservation> findByReservationName(@Param("rn") String rn);
}
