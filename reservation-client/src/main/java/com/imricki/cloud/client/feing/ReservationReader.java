package com.imricki.cloud.client.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.netflix.client.util.Resources;


@FeignClient("reservation-service")
public interface ReservationReader {

	@GetMapping("/reservations")
	Resources<ReservationDto> reead();
}
