package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Locataire;
@Repository
public interface RepositoryLocataire extends JpaRepository<Locataire,Integer>{

}
