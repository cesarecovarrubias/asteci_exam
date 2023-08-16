package com.example.demo.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	private String lastName;
	
	@OneToOne(mappedBy = "operatorCreated")
	private Incidence incidence_create;
	
	@OneToOne(mappedBy = "operatorUpdated")
	private Incidence incidence_update;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Incidence getIncidence_create() {
		return incidence_create;
	}
	public void setIncidence_create(Incidence incidence_create) {
		this.incidence_create = incidence_create;
	}
	public Incidence getIncidence_update() {
		return incidence_update;
	}
	public void setIncidence_update(Incidence incidence_update) {
		this.incidence_update = incidence_update;
	}
	
	

}
