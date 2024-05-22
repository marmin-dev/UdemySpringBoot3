package com.marmin.learnspringframwork.examples.a4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}
@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA){
        super();
        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Something Happened");
    }
}

@Configuration
@ComponentScan // 해당 패키지 내에 컴포넌트가 있는지 조회
public class LazyIntializationLauncherApplication {

    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(
                LazyIntializationLauncherApplication.class
        )){
            System.out.println("INIT ENDED");
            context.getBean(ClassB.class).doSomething();
        }
    }

}
