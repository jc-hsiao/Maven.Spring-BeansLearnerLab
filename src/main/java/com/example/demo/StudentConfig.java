package com.example.demo;

import org.springframework.context.annotation.Bean;

public class StudentConfig {


    @Bean(name = "students")
    public Students currentStudents(){
      return null;
    }

    @Bean
    public Students previousStudents(){
        return null;
    }
}
