package com.marmin.learnspringframwork;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age){};

record Address(String road, String city){};

record NewPerson(String name, int age,  Address address){};
@Configuration
public class HelloWorldConf {

    @Bean // 스프링 컨테이너가 관리하는 빈을 생성하는 어노테이션
    public String name(){
        return "Marmin";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("killwhan",20);
    }

    @Bean
    public Person person2(){
        return new Person(name(),age());
    }

    @Bean
    @Primary
    public Person person3(){
        return new Person(name(),age() + 4);
    }

    @Bean(name = "keep")
    @Qualifier("addressQual")
    public Address address(){
        return new Address("soho","newyork");
    }

    @Bean
    public NewPerson newPerson(){
        return new NewPerson(name(),age(),address());
    }

    @Bean
    public NewPerson newPerson2(String name, int age, @Qualifier("addressQual") Address address){
        return new NewPerson(name,age,address);
    }



}
