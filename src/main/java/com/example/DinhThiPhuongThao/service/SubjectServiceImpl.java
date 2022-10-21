package com.example.DinhThiPhuongThao.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DinhThiPhuongThao.entity.Subject;
import com.example.DinhThiPhuongThao.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {
@Autowired
private SubjectRepository subjectRepository;
@Transactional
	@Override
	public List<Subject> getDS() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}

@Transactional
@Override
public void saveSubject(Subject subject) {
	subjectRepository.save(subject);
	
}

}
