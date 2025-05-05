package com.example.joinsdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.joinsdemo.model.Enrollment;
import com.example.joinsdemo.repository.EnrollmentRepository;

@Service
public class JoinService {
 private final EnrollmentRepository enrollmentRepository;

    public JoinService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public List<Enrollment> getInnerJoinData() {
        return enrollmentRepository.innerJoin();
    }

    public List<Enrollment> getLeftJoinData() {
        return enrollmentRepository.leftJoin();
    }

    public List<Enrollment>  getRightJoinData() {
        return enrollmentRepository.rightJoin();
    }

    public List<Object[]> getFullJoinData() {
        return enrollmentRepository.fullJoinRaw();
    }
}
