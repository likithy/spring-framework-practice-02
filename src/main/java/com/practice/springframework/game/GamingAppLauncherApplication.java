package com.practice.springframework.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.practice.springframework.game")
public class GamingAppLauncherApplication {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
      context.getBean(GameRunner.class).run();
    }
  }
}
