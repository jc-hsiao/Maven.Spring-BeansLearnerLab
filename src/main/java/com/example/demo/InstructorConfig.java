package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class InstructorConfig {
    @Primary
    @Bean
    public Instructors instructors(){
        return null;
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
