package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import com.in28minutes.springboot.learnjpaandhibernate.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        /*courseJpaRepository.insert(new Course(1, "Learn React", "in28minutes"));
        courseJpaRepository.insert(new Course(2, "Learn GCP", "in28minutes"));
        courseJpaRepository.insert(new Course(3, "Learn Jenkins", "in28minutes"));

        courseJpaRepository.delete(2);

        System.out.println(courseJpaRepository.findByID(1));
        System.out.println(courseJpaRepository.findByID(3));

         */
    }
}
