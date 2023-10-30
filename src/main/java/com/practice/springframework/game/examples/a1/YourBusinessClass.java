package com.practice.springframework.game.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YourBusinessClass {
  // Field Injection
  // @Autowired
  Dependency1 dependency1;
  // @Autowired
  Dependency2 dependency2;


  public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
    System.out.println("Constructor injection - Your business class");
    this.dependency1 = dependency1;
    this.dependency2 = dependency2;
  }

 //  setter injection
  //@Autowired
  public void setDependency2(Dependency2 dependency2) {
    System.out.println("Setter Injection :  dependency2");
    this.dependency2 = dependency2;
  }

  //@Autowired
  public void setDependency1(Dependency1 dependency1) {
    System.out.println("Setter Injection :  dependency1");
    this.dependency1 = dependency1;
  }

  public String toString() {
    return "Using " + dependency1 + " and " + dependency2;
  }
}
