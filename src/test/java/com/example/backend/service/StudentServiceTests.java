package com.example.backend.service;

import com.example.backend.model.Student;
import com.example.backend.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

public class StudentServiceTests {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    public StudentServiceTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void whenFindById_thenReturnStudent() {
       
        Student student = new Student("John", "Doe", "john.doe@example.com");
        when(studentRepository.findById(anyLong())).thenReturn(Optional.of(student));

        
        Student found = studentService.getStudentById(1L);

     
        assertThat(found.getFirstName()).isEqualTo(student.getFirstName());
        verify(studentRepository, times(1)).findById(anyLong());
    }
}
