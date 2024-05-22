package com.marmin.learnspringframwork.examples.a5;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass{

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // 프로토 타입 클래스가 된다
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan("com.marmin.learnspringframwork.examples.a5") // 해당 패키지 내에 컴포넌트가 있는지 조회
public class BeanScopeLauncher {



    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(
                BeanScopeLauncher.class
        )){
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }

}
