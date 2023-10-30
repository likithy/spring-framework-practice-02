package com.practice.springframework.examples.calculations;

import com.practice.springframework.examples.calculations.businessLogic.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationLauncher {
  public static void main(String[] args) {
    try (AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(ApplicationLauncher.class)) {
      System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
  }
}
