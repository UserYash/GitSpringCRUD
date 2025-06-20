package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.StudentRepository;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	StudentRepository sr;
}
