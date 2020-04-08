package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {


    Student[] myCohort = {
            new Student(1L,"Nate"),
            new Student(2L,"Rosa"),
            new Student(3L,"Hue")
    };

    Student[] lastCohort = {
            new Student(1L,"Hilbert"),
            new Student(2L,"Hilda"),
            new Student(3L,"Cheren"),
            new Student(4L,"Bianca")
    };

    @Bean(name = "students")
    public Students currentStudents(){
        return new Students(myCohort);
    }

    @Bean
    public Students previousStudents(){
        return new Students(lastCohort);
    }
}
