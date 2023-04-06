package com.project.api.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.api.entity.Sim;
import com.project.api.repository.SimRepository;
import com.project.api.service.SimService;

@Service
public class ServiceImpl implements SimService {

	@Autowired
	private SimRepository simRepository;

	@Override
	public String saveStudent(Sim sim) {
		simRepository.save(sim);
		return "Sim Data is saved successfully";
	}

	@Override
	public List<Sim> find() {
		return  simRepository.findAll();
		
	}

	@Override
	public List<Sim> findName(String name) throws ClassNotFoundException {
		 	List<Sim> list = simRepository.findByName(name);
		 	if(! list.isEmpty()) {
		 		return list;
		 	}else {
		 		throw new ClassNotFoundException("Data is not found with this name :"+name);
		 	}
//		 	return null;
	}

	@Override
	public List<Sim> findid(int id) throws ClassNotFoundException {
		List<Sim> list1 = simRepository.findById(id);
	 	if( list1!=null) {
	 		return list1;
	 	}else {
	 		throw new ClassNotFoundException("Data is not found with this id :"+id);
	 	}
//		return null;
	}
	
}
