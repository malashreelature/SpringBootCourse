package com.example.demo.entity.controller;

import com.example.demo.courseRepo.CourseRepo;
import com.example.demo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/Course")
public class CourseController {
    @Autowired
    private CourseRepo courseRepo;

    @GetMapping("/home")
    public String home() {
        return "welcome to E2EHiring";
    }
    @GetMapping("/get")
    public List<Course> findAll() {

        return courseRepo.findAll();
    }
    @PostMapping("/save")
    public Course save(@RequestBody Course course) {
        courseRepo.save(course);
        return course;
    }


    @DeleteMapping(value = "delete/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        System.out.println("deleted student");
        courseRepo.deleteById(id);
    }
    @PutMapping("/update")
    public Course update(@RequestBody Course course) {
        return CourseRepo.update(course);
    }


}