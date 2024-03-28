package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJPACommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJpaRepository.save(new Course(1, "Learn React - Data JPA", "in28minutes"));
        courseSpringDataJpaRepository.save(new Course(2, "Learn GCP - Data JPA", "in28minutes"));
        courseSpringDataJpaRepository.save(new Course(3, "Learn Jenkins - Data JPA", "in28minutes"));

        courseSpringDataJpaRepository.deleteById(2l);

        System.out.println(courseSpringDataJpaRepository.findById(1l));
        System.out.println(courseSpringDataJpaRepository.findById(3l));

    }
}
