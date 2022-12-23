package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="proprietaire")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
public class Proprietaire  extends Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prop ;
		
		

}
