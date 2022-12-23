package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Administrateur;
import com.example.demo.repository.RepositoryAdmin;
@Service

public class ServiceAdmin {
	@Autowired
	private RepositoryAdmin adm;
	
	public List<Administrateur> listAll() {
		return adm.findAll();
	}

	public void save(Administrateur admin) {
		adm.save(admin);
	}

	public Administrateur get(int id) {
		return adm.findById(id).get();
	}

	public void delete(int id) {
		adm.deleteById(id);
	}
}
