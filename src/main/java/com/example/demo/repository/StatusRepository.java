package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Status;


@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{

}
