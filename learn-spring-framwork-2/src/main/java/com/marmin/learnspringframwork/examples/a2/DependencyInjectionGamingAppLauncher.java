package com.marmin.learnspringframwork.examples.a2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass{
    Dependency1 dependency1;

    Dependency2 dependency2;

    // 세터 주입 방식
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

    // 생성자 주입 방식
//    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "USING" + dependency1 + "AND" + dependency2;
    }
}
@Component
class Dependency1 {


}
@Component
class Dependency2 {

}

@Configuration
@ComponentScan("com.marmin.learnspringframwork.examples.a2") // 해당 패키지 내에 컴포넌트가 있는지 조회
public class DependencyInjectionGamingAppLauncher {
    public static void main(String[] args) {
        // 컴포넌트로 등록 후 상단 component scan을 사용하면 가능하다.
        try(var context= new AnnotationConfigApplicationContext(
                DependencyInjectionGamingAppLauncher.class
        )){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class).toString());
        }
    }

}
