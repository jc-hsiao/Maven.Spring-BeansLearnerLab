package com.example.demo;

import java.util.List;

public class Students extends People<Student>{
    public Students(Student[] arr) {
        super(arr);
    }

    public Students(List<Student> personList) {
        super(personList);
    }
}
