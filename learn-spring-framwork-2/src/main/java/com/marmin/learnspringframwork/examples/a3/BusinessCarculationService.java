package com.marmin.learnspringframwork.examples.a3;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCarculationService{

    private DataService dataService;

    // 생성자를 통한 의존성 주입
    public BusinessCarculationService (DataService dataService){
        super();
        this.dataService = dataService;
    }


    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
