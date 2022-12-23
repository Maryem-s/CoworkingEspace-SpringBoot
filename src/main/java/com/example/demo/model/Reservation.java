package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="reservation")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reserv;

	private Date date_deb;

	private Date date_fin;
	@ManyToOne
	private Espace espace;
	@ManyToOne
	private Locataire locataire;
	
	
}
