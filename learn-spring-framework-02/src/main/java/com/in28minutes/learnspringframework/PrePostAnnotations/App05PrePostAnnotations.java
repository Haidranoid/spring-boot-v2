package com.in28minutes.learnspringframework.PrePostAnnotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass {
    private SomeDependency someDependency;

    @Autowired
    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("cleanup");
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}


@Configuration
//@ComponentScan("com.in28minutes.learnspringframework.beansScopes")
@ComponentScan
public class App05PrePostAnnotations {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(App05PrePostAnnotations.class)) {


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
