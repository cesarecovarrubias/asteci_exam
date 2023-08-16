package com.example.demo.repository.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Incidence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "id_operator_created",  referencedColumnName = "id")
	private Operator operatorCreated;
	
	@OneToOne
	@JoinColumn(name = "id_operator_updated",  referencedColumnName = "id")
	private Operator operatorUpdated;
	
	
	@OneToOne
	@JoinColumn(name = "id_computer_equipment",  referencedColumnName = "id")
	private ComputerEquipment computerEquipment;
	
	@OneToOne
	@JoinColumn(name = "id_status",  referencedColumnName = "id")
	private Status status;
	
	private Timestamp creationDate;
	
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Operator getOperatorCreated() {
		return operatorCreated;
	}

	public void setOperatorCreated(Operator operatorCreated) {
		this.operatorCreated = operatorCreated;
	}

	public Operator getOperatorUpdated() {
		return operatorUpdated;
	}

	public void setOperatorUpdated(Operator operatorUpdated) {
		this.operatorUpdated = operatorUpdated;
	}

	public ComputerEquipment getComputerEquipment() {
		return computerEquipment;
	}

	public void setComputerEquipment(ComputerEquipment computerEquipment) {
		this.computerEquipment = computerEquipment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
