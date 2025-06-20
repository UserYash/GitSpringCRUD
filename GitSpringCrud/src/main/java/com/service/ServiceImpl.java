package com.service;

import java.util.List;

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
}
