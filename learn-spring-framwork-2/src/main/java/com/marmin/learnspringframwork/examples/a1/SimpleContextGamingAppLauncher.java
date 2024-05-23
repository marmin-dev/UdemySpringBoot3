package com.marmin.learnspringframwork.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.marmin.learnspringframwork.examples.a1") // 해당 패키지 내에 컴포넌트가 있는지 조회
public class SimpleContextGamingAppLauncher {



    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(
                com.marmin.learnspringframwork.examples.a1.SimpleContextGamingAppLauncher.class
        )){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
