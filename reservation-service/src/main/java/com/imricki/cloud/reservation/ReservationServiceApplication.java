package com.imricki.cloud.reservation;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.imricki.cloud.reservation.entity.Reservation;
import com.imricki.cloud.reservation.repo.ReservationRepository;

@SpringBootApplication
@EnableEurekaClient
public class ReservationServiceApplication implements CommandLineRunner {

	@Autowired
	private final ReservationRepository reservationRepository;

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Stream.of("Josh", "Dr. Johnson", "Dr. Syer", "Dr. Pollack")
				.forEach(n -> reservationRepository.save(new Reservation(n)));
		reservationRepository.findAll().forEach(System.out::println);

	}

}
