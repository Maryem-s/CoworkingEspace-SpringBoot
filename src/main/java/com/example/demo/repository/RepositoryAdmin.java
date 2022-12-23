package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Administrateur;
@Repository
public interface RepositoryAdmin extends JpaRepository<Administrateur,Integer> {

}
