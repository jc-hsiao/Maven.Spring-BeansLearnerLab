package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class InstructorConfig {
    Instructor[] instructors = {
            new Instructor(1L,"Juniper"),
            new Instructor(2L,"Fennel")
    };

    @Primary
    @Bean
    public Instructors instructors(){
        return new Instructors(instructors);
    }
    @Bean
    public Instructors tcUsaInstructors(){
        return null;
    }
    @Bean
    public Instructors tcUkInstructors(){
        return null;
    }

}
