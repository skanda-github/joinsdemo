package com.example.joinsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.joinsdemo.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
