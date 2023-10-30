package com.practice.springframework.examples.a0;

import java.util.Arrays;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
  public static void main(String[] args) {
    try (var context =
        new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
  }
}
