package com.example.demo.entity.controller;

import com.example.demo.courseRepo.StudentRepo;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Student")
public class StudentController {
    @Autowired
private StudentRepo studentRepo;

    @GetMapping("/home")
    public String home() {
        return "welcome to E2EHiring";
    }
    @GetMapping("/get")
    public List<Student> findAll() {

        return studentRepo.findAll();
    }
    @PostMapping("/save")
    public Student save(@RequestBody Student student) {
        studentRepo.save(student);
        return student;
    }


    @DeleteMapping(value = "delete/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        System.out.println("deleted student");
        studentRepo.deleteById(id);
    }
    @PutMapping("/update")
    public Student update(@RequestBody Student student) {
        return StudentRepo.update(student);
    }



}
