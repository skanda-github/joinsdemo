package com.example.joinsdemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Getter
@Setter
@JsonIgnoreProperties({"enrollments"})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates ID
    private Long id;

    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL) // One student can enroll in many courses
    private List<Enrollment> enrollments;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }
}