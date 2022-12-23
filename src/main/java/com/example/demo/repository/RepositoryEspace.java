package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Espace;
@Repository
public interface RepositoryEspace extends JpaRepository<Espace,Integer>{

}
