package com.project.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.project.api.entity.Sim;

@Service
public interface SimService {
	
	public String saveStudent(Sim  sim);
	
	public List<Sim> find();
	
	public List<Sim> findName(String name) throws ClassNotFoundException; 
	
	public List<Sim> findid(int id) throws ClassNotFoundException;
}
