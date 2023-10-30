package com.practice.springframework.game.examples.a1;

import org.springframework.context.annotation.*;

import java.util.Arrays;
//Yourbusiness
//dependency1
//dependency1

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
  public static void main(String[] args) {
    try (var context =
        new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      System.out.println(context.getBean(YourBusinessClass.class));
    }
  }
}
