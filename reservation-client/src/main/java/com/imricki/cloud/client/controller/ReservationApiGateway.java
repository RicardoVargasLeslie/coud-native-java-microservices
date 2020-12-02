package com.imricki.cloud.client.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imricki.cloud.client.feing.ReservationDto;
import com.imricki.cloud.client.feing.ReservationReader;

@RestController
@RequestMapping("/reservations")
public class ReservationApiGateway {

	private final ReservationReader reader;

	@Autowired
	public ReservationApiGateway(ReservationReader reader) {
		this.reader = reader;
	}

	@GetMapping("/names")
	public Collection<String> names() {

		return this.reader.read().stream()
		.map(ReservationDto::getReservationName)
		.collect(Collectors.toList());
	}
}
