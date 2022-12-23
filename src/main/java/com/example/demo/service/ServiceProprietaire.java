package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Proprietaire;
import com.example.demo.repository.RepositoryProprietaire;


@Service
public class ServiceProprietaire {
	
	@Autowired
private RepositoryProprietaire prop;
	
	public List<Proprietaire> listAll() {
		return prop.findAll();
	}

	public void save(Proprietaire p ) {
		prop.save(p);
	}

	public Proprietaire get(int id) {
		return prop.findById(id).get();
	}

	public void delete(int id) {
		prop.deleteById(id);
	}
	 public Proprietaire getByEmail(String email)
	    {
		 Proprietaire c = null;
	    	List<Proprietaire> list = prop.findAll();
	        for(int i=0;i<list.size();i++)
	        {
	        	if((list.get(i).getEmail()).equals(email))
	        			
	        		 c=list.get(i);  			
	        }
	        return c;
	    }
}
