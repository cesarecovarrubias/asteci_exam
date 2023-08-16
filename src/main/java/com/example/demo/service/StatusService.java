package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.StatusRepository;
import com.example.demo.repository.model.Status;

@Service
public class StatusService {
	
	StatusRepository statusRepository;

	@Autowired
	public StatusService(StatusRepository statusRepository) {
		this.statusRepository = statusRepository;
	}
	
	public List<Status> getAllStatus(){
		return statusRepository.findAll();
	}
	
}
