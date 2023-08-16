package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Operator;

@Repository
public interface OperatorReporitory extends JpaRepository<Operator, Long>{

}
