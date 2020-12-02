package com.imricki.cloud.client.feing;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("reservation-service")
public interface ReservationReader {

	@GetMapping("/reservations")
	Collection<ReservationDto> read();
}
