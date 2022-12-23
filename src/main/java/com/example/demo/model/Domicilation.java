package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="domicilation")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Domicilation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ref_domicilation;
	private int durée;
	
	

	
}
