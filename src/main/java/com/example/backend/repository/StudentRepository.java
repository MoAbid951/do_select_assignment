package com.example.backend.repository;

import com.example.backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    
    @Query("SELECT s FROM Student s")
    List<Student> findAllStudents();

    
    @Query("SELECT s FROM Student s WHERE s.id = :id")
    Student findStudentById(@Param("id") Long id);

 
    @Query("DELETE FROM Student s WHERE s.id = :id")
    void deleteStudentById(@Param("id") Long id);
}
