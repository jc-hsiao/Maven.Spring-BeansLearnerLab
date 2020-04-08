package com.example.demo;

import java.util.stream.StreamSupport;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name){
        super(id,name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / StreamSupport.stream(learners.spliterator(), false).count();;
        learners.forEach(l -> l.learn(numberOfHoursPerLearner));
    }
}
