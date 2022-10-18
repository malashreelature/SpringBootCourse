package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
    @Table(name = "Student")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long rollno;
        private String name;

        @OneToMany(cascade = CascadeType.ALL)
        private Set<Course> ob;
        public Long getRollno() { return rollno; }

        public Student() {}

        public Student(Long rollno, String name)
        {
            this.rollno = rollno;
            this.name = name;
        }

        public void setRollno(Long rollno)
        {

            this.rollno = rollno;
        }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }
    }



