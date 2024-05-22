package com.marmin.learnspringframwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldSpring {
    public static void main(String[] args) {
        // 1. launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConf.class);
        // 2.  Configure the things that we want Spring to manange
        // 컨텍스트에서 값 가져오기
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person").toString());
        System.out.println(context.getBean(Address.class).toString());
        System.out.println(context.getBean(("person2")));
        System.out.println(context.getBean(("newPerson")));
        String name = context.getBean("name").toString();

        System.out.println(context.getBean(Person.class));

        // 이 레지스트리에 정의된 모든 이름을 반환한다.
        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );

        // 레지스트리에 정의된 Bean 개수를 반환하는 getBeanDefinitionCount도 있다
        System.out.println(context.getBeanDefinitionCount());



    }
}
