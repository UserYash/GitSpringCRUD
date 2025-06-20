package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;
	
	@PostMapping("/addData")
	public Student addStudent(@RequestBody Student s) {
		
		Student stu= si.addStu(s);
		
		return stu;
	}
	
	@GetMapping("/getData")
	public List<Student> getStudent()
	{
		List<Student> list= si.getAllData();
		
		return list;
	}
	
	@PutMapping("/student/{id}")
	public Student updateData(@RequestBody Student s,@PathVariable int id) 
	{
		return si.updateData(s,id);
		
	}
	
	@DeleteMapping("/delStu/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		si.deleteData(id);
	}
	
	
	
}
