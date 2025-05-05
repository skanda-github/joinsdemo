package com.example.joinsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.joinsdemo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
