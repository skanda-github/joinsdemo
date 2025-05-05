package com.example.joinsdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.joinsdemo.model.Enrollment;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    @Query("SELECT e FROM Enrollment e JOIN e.student s JOIN e.course c")
    List<Enrollment> innerJoin();

    @Query("SELECT e FROM Enrollment e RIGHT JOIN e.course c")
    List<Enrollment> rightJoin();

    @Query("SELECT e FROM Enrollment e LEFT JOIN e.student s")
    List<Enrollment> leftJoin();

    @Query(value =
        "SELECT * FROM student s LEFT JOIN enrollment e ON s.id = e.student_id LEFT JOIN course c ON c.id = e.course_id " +
        "UNION " +
        "SELECT * FROM student s RIGHT JOIN enrollment e ON s.id = e.student_id RIGHT JOIN course c ON c.id = e.course_id",
        nativeQuery = true)
    List<Object[]> fullJoinRaw(); // simplified for native
}

