package com.example.junitin5steps;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach (){
        System.out.println("BeforeEach");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test3");
    }

    @AfterEach
    void AfterEach (){
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll");
    }
}
