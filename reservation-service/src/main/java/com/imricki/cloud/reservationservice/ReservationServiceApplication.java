package com.imricki.cloud.reservationservice;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.imricki.cloud.reservationservice.entity.Reservation;
import com.imricki.cloud.reservationservice.repository.ReservationRepository;

@SpringBootApplication
public class ReservationServiceApplication implements CommandLineRunner {

	@Autowired
	private ReservationRepository reservationRepository;

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Stream.of("Mark", "Jon", "Juan", "Fran")
		.forEach(name -> reservationRepository.save(new Reservation(name)));
		reservationRepository.findAll().forEach(name -> (System.out::println);
	}

}
