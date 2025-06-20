package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	StudentRepository sr;

	@Override
	public Student addStu(Student s) {
		
		return sr.save(s);
	}

	@Override
	public List<Student> getAllData() {
		
		return sr.findAll();
	}
	
	
	@Override
    public Student updateData(Student s, int id) {
        Optional<Student> optional = sr.findById(id);

        if (optional.isPresent()) {
            Student existing = optional.get();

            
            existing.setName(s.getName());
            existing.setAddr(s.getAddr());
            
            return sr.save(existing);
        } else {
            return null; 
        }
    }
}
