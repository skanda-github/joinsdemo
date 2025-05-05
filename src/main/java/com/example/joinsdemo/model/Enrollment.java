package com.example.joinsdemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Many enrollments can belong to one student
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne // Many enrollments can belong to one course
    @JoinColumn(name = "course_id")
    private Course course;

    public Enrollment() {}

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}
