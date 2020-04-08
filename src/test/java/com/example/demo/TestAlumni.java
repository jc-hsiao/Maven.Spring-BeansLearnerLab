package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {

    @Autowired
    Alumni a;
    Instructors instructors = a.getInstructors();
    Students students = a.getPreviousStudents();
    int numberOfInstructors = instructors.size();
    int numberOfStudents = students.size();
    double numberOfHoursToTeachEachStudent = 1200;
    double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
    double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

    @Test
    public void test1(){
        a.getPreviousStudents().forEach(s -> Assert.assertEquals(numberOfHoursToTeachEachStudent, s.getTotalStudyTime(), 0.1));
    }

}
