package com.marmin.learnspringframwork.examples.a6;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println("Some Dependency Ready");
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Clean up");
    }
}

@Component
class SomeDependency{
    public void getReady(){
        System.out.println("Some lOgic Using SomeDep");
    }
}

@Configuration
@ComponentScan("com.marmin.learnspringframwork.examples.a6") // 해당 패키지 내에 컴포넌트가 있는지 조회
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(
                PrePostAnnotationsContextLauncherApplication.class
        )){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
