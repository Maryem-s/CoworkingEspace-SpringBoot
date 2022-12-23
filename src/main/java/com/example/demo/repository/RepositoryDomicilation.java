package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Domicilation;
@Repository
public interface RepositoryDomicilation extends JpaRepository<Domicilation,Integer> {
    
}
