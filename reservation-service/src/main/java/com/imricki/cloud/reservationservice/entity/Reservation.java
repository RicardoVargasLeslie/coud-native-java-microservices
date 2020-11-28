package com.imricki.cloud.reservationservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Reservation {

	public Reservation(String reservationName) {
		super();
		this.reservationName = reservationName;
	}

	@Id
	@GeneratedValue
	private Long id;
	private String reservationName;

	public Reservation() {
	}
}
