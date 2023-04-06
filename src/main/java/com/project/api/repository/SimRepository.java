package com.project.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.api.entity.Sim;

@Repository
public interface SimRepository extends JpaRepository<Sim, Integer> {

	public List<Sim> findByName(String name);
	
	public List<Sim> findById(int id);
}
