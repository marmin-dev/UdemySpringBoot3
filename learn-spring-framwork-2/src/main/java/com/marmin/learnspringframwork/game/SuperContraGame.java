package com.marmin.learnspringframwork.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("UP");
    }
    public void down(){
        System.out.println("Sit");
    }
    public void left(){
        System.out.println("Back");
    }

    public void right(){
        System.out.println("Forward");
    }
}
