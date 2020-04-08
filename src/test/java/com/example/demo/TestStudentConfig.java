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
public class TestStudentConfig{

    @Autowired
    @Qualifier("students")
    Students s;

    @Autowired
    @Qualifier("previousStudents")
    Students s2;

    @Test
    public void test1(){
        Assert.assertEquals(3,s.size());
    }
    @Test
    public void test2(){
        Assert.assertEquals(4,s2.size());
    }
    @Test
    public void testPrint(){
        System.out.println(s);
        System.out.println(s2);

    }
}
