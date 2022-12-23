package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Reservation;
import com.example.demo.repository.RepositoryReservation;
@Service

public class ServiceReservation {
	@Autowired
private RepositoryReservation reserve;
	
	public List<Reservation> listAll() {
		return reserve.findAll();
	}

	public void save(Reservation res ) {
		reserve.save(res);
	}

	public Reservation get(int id) {
		return reserve.findById(id).get();
	}

	public void delete(int id) {
		reserve.deleteById(id);
	}
}
