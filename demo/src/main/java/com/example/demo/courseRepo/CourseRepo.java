package com.example.demo.courseRepo;

import com.example.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepo extends JpaRepository<Course,Long> {


    public static Course update(Course course) {
        return course;
    }



}
