package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="Course")
public class Course {
    @Id
    private long id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn (name = "Student_id")
    Student ob;


    public Course() {
        super();
    }

    public Course(long id, String title, String description,Student ob ){
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.ob=ob;
    }

    public Course(int i, String java_core_course) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    }

