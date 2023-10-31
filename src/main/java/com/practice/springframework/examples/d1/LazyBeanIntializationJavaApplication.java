package com.practice.springframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LazyBeanIntializationJavaApplication {
  public static void main(String[] args) {
    try (var context =
        new AnnotationConfigApplicationContext(LazyBeanIntializationJavaApplication.class)) {
      System.out.println("Intilization of context is done");
      context.getBean(ClassB.class).doSomething();
    }
  }
}
