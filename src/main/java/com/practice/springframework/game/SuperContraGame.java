package com.practice.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContra")
public class SuperContraGame implements GamingConsole {

  public void up() {
    System.out.println("Super contra UP");
  }

  public void down() {
    System.out.println("Super contra DOWN");
  }

  public void left() {
    System.out.println("Super contra LEFT");
  }

  public void right() {
    System.out.println("Super contra RIGHT");
  }
}
