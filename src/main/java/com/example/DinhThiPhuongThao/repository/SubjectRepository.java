package com.example.DinhThiPhuongThao.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DinhThiPhuongThao.entity.Subject;




@Repository
public interface SubjectRepository extends JpaRepository<Subject, String> {

}