package com.practice.springframework.examples.e1;

import java.util.Arrays;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class BeanScopestLauncherApplication {
  public static void main(String[] args) {
    try (var context =
        new AnnotationConfigApplicationContext(BeanScopestLauncherApplication.class)) {
      System.out.println(context.getBean(NormalClass.class));
      System.out.println(context.getBean(NormalClass.class));
      System.out.println(context.getBean(PrototypeClass.class));
      System.out.println(context.getBean(PrototypeClass.class));
      System.out.println(context.getBean(PrototypeClass.class));
    }
  }
}
