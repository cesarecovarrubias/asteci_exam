package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.ComputerEquipment;

@Repository
public interface ComputerEquipmentRepository extends JpaRepository<ComputerEquipment, Long>{

}
