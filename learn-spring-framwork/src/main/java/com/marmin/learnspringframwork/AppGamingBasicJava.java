package com.marmin.learnspringframwork;

import com.marmin.learnspringframwork.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
//        var superContraGame = new SuperContraGame();
//
//        var pacManGame = new PacManGame(); // 1:Object Creation
//        var gameRunner = new GameRunner(pacManGame); // 2:Object Creation + Wiring Dependency. Game is dependency
//        gameRunner.run();
        try (var context = new AnnotationConfigApplicationContext(GamingConf.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
