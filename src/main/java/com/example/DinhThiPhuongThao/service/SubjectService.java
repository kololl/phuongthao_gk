package com.example.DinhThiPhuongThao.service;

import java.util.List;

import com.example.DinhThiPhuongThao.entity.Subject;



public interface SubjectService {
	List<Subject> getDS();

	void saveSubject(Subject subject);

//	void deleteStudent(String id);
//	Student getById (String id);
	
//	void saveDto(ApiUser apiUser);
}
