package com.practice.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
  public void up() {
    System.out.println("Mario UP");
  }

  public void down() {
    System.out.println("Mario DOWN");
  }

  public void left() {
    System.out.println("Mario LEFT");
  }

  public void right() {
    System.out.println("Mario RIGHT");
  }
}
