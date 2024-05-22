package com.marmin.learnspringframwork.examples.a3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.marmin.learnspringframwork.examples.a3") // 해당 패키지 내에 컴포넌트가 있는지 조회
public class RealWorldSpringContextLauncher {



    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(
                RealWorldSpringContextLauncher.class
        )){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCarculationService.class).findMax());
        }
    }

}
