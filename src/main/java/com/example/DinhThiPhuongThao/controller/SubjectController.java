package com.example.DinhThiPhuongThao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DinhThiPhuongThao.entity.Subject;
import com.example.DinhThiPhuongThao.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	 private SubjectService subjectService;
	@GetMapping("/subject")
	List<Subject> getList(){
		return subjectService.getDS();
		
	}
	@PostMapping("/subject")
	Subject insert(@RequestBody Subject subject) {
	subjectService.saveSubject(subject);
	return subject;
	}
//	@PutMapping("/student")
//	Student update(@RequestBody Student student) {
//		studentService.saveStudent(student);
//		return student;
//	}
//	@DeleteMapping("/student/{id}")
//	void delete(@PathVariable String id) {
//		studentService.deleteStudent(id);
//		
//	}
//	@GetMapping("/student/{id}")
//	Student getById(@PathVariable String id) {
//	       return	studentService.getById(id);
//		
//	}
}
