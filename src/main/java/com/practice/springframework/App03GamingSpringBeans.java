package com.practice.springframework;

import com.practice.springframework.game.GameRunner;
import com.practice.springframework.game.GamingConsole;
import com.practice.springframework.game.MarioGame;
import com.practice.springframework.game.PacMan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.practice.springframework.game")
public class App03GamingSpringBeans {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
      context.getBean(GameRunner.class).run();
    }
  }
}
