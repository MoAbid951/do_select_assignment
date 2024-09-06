package com.example.backend.repository;

import com.example.backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    
    @Query("Write Your query")
    List<Student> findAllStudents();

    
    @Query("Write Your query")
    Student findStudentById(@Param("id") Long id);

 
    @Query("Write Your query")
    void deleteStudentById(@Param("id") Long id);
}
