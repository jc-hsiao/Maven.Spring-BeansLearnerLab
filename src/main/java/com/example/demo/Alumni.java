package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    Students previousStudents;
    Instructors instructors;

    @Autowired
    public Alumni(Students previousStudents,Instructors instructors){
        this.previousStudents = previousStudents;
        this.instructors = instructors;
    }

    @PostConstruct
    void executeBootCamp(){
        previousStudents.forEach(s -> s.learn(1200));
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
