package com.example.demo;

import java.util.List;

public class Instructors extends People<Instructor> {
    public Instructors(Instructor[] arr) {
        super(arr);
    }

    public Instructors(List<Instructor> personList) {
        super(personList);
    }
}
