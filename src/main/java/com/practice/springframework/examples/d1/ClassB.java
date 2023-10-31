package com.practice.springframework.examples.d1;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {
    private ClassA  classA;
    public ClassB(ClassA classA){
        System.out.println("Some intilization logic");
        this.classA = classA;
    }

    void doSomething(){
        System.out.println("Do something");
    }
}
