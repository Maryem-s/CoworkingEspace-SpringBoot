package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Locataire;
import com.example.demo.repository.RepositoryLocataire;
@Service

public class ServiceLocataire {
	@Autowired
	private RepositoryLocataire loc;
	
	public List<Locataire> listAll() {
		return loc.findAll();
	}

	public void save(Locataire locator) {
		loc.save(locator);
	}

	public Locataire get(int id) {
		return loc.findById(id).get();
	}

	public void delete(int id) {
		loc.deleteById(id);
	}
}
