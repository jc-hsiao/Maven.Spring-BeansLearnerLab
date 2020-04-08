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
public class TestClassroomConfig {
    @Autowired
    @Qualifier("currentCohort")
    Classroom room;

    @Autowired
    @Qualifier("previousCohort")
    Classroom room2;

    @Test
    public void test1(){
        Assert.assertEquals(3,room.getStudents().size());
        Assert.assertEquals(2,room.getInstructors().size());
    }

    @Test
    public void test2(){
        System.out.println(room2.getStudents());
        Assert.assertEquals(4,room2.getStudents().size());
        Assert.assertEquals(2,room2.getInstructors().size());

    }
}
