package com.project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.entity.Sim;
import com.project.api.service.SimService;

import jakarta.validation.Valid;

@RestController
public class SimController {

	@GetMapping("/")
	public ResponseEntity<String> test() {
		return ResponseEntity.status(200).body("It's working");
	}
	
	@Autowired
	private SimService service;
	
	@PostMapping("addSim")
	public String addData(@RequestBody @Valid Sim sim) {
		String data = service.saveStudent(sim);
		return data;
	}
	
	@GetMapping("getSim")
	public List<Sim> getSim(){
		List<Sim> list = service.find();
		return list;
	}
	@GetMapping("getSimName")
    public List<Sim> getSimName(@RequestParam String name) throws ClassNotFoundException{
    	return service.findName(name);
    }
	@GetMapping("getSimId")
	public List<Sim> getSimId(@RequestParam int id) throws ClassNotFoundException{
    	return service.findid(id);
}
}