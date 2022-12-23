package com.example.demo.model;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
	
	@Column
	private String lastname;
	
	@Column
	private String firstname;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column	
	private String city;
	 @ManyToMany
	  Set<Domicilation> domicilation;

	@Override
	public String toString() {
		return " Personne lastname=" + lastname + ", firstname=" + firstname + ", login=" + email
				+ ", password=" + password + ", city=" + city ;
	}

}
