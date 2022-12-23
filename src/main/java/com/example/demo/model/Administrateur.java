package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="admin")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Administrateur  extends Personne{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_admin ;
}
