package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Espace;
import com.example.demo.repository.RepositoryEspace;
@Service
public class ServiceEspace {
	@Autowired
	private RepositoryEspace espace;
	
	public List<Espace> listAll() {
		return espace.findAll();
	}

	public void save(Espace esp) {
		espace.save(esp);
	}

	public Espace get(int id) {
		return espace.findById(id).get();
	}

	public void delete(int id) {
		espace.deleteById(id);
	}
}
