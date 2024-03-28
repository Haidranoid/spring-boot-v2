package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import com.in28minutes.springboot.learnjpaandhibernate.entities.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJpaRepository {

    private EntityManager entityManager;

    @Autowired
    public CourseJpaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void insert(Course course) {
        entityManager.merge(course);
    }

    @Transactional
    public void delete(int id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course findByID(int id) {
        return entityManager.find(Course.class, id);
    }
}
