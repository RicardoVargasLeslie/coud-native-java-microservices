package com.imricki.cloud.reservation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	private final String value;

	@RequestMapping(method = RequestMethod.GET, value = "/message")
	public String read() {
		return this.value;
	}

	@Autowired
	public MessageRestController(@Value("${message}") String value) {
		this.value = value;
	}
}
