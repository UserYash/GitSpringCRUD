package com.service;

import java.util.List;

import com.model.Student;

public interface ServiceI {

	public Student addStu(Student s);

	public List<Student> getAllData();

	public Student updateData(Student s, int id);

}
