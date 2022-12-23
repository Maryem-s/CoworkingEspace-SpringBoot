package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Domicilation;
import com.example.demo.repository.RepositoryDomicilation;
@Service
public class ServiceDomicilation {
	@Autowired
	private RepositoryDomicilation domic;

	public List<Domicilation> listAll() {
		return domic.findAll();
	}

	public void save(Domicilation dom) {
		domic.save(dom);
	}

	public Domicilation get(int id) {
		return domic.findById(id).get();
	}

	public void delete(int id) {
		domic.deleteById(id);
	}

}
