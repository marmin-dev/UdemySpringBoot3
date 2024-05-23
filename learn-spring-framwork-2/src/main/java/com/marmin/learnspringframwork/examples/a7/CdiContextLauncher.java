package com.marmin.learnspringframwork.examples.a7;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;


//@Component
//@Named
@Service
class BusinessService {
    private DataService dataService;


    public DataService getDataService() {

        return dataService;
    }
//    @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}

//@Component
//@Named
@Repository
class DataService{

}


@Configuration
@ComponentScan("com.marmin.learnspringframwork.examples.a7") // 해당 패키지 내에 컴포넌트가 있는지 조회
public class CdiContextLauncher {



    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(
                CdiContextLauncher.class
        )){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());
            // null 이 출력된다.
        }
    }

}
