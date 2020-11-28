package com.imricki.cloud.reservationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ReservationRestController {

	private String value;

	@Autowired
	public ReservationRestController(@Value("${message}") String value) {

		this.value = value;
	}

	@GetMapping("/message")
	public String read() {

		return this.value;
	}

}
