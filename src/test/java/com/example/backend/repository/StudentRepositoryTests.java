package com.example.backend.repository;

import com.example.backend.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class StudentRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void whenFindById_thenReturnStudent() {
       
        Student student = new Student("John", "Doe", "john.doe@example.com");
        entityManager.persist(student);
        entityManager.flush();

       
        Optional<Student> found = studentRepository.findById(student.getId());

        
        assertThat(found).isPresent();
        assertThat(found.get().getFirstName()).isEqualTo(student.getFirstName());
    }
}
