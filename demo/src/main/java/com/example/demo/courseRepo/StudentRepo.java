package com.example.demo.courseRepo;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
    public static Student update(Student student) {
        return student;
    }
}
