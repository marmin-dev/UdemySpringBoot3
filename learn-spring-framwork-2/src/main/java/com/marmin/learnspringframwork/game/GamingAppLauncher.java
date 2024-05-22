package com.marmin.learnspringframwork.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.marmin.learnspringframwork.game") // 해당 패키지 내에 컴포넌트가 있는지 조회
public class GamingAppLauncher {


//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        System.out.println("parameter" + game.toString());
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    public static void main(String[] args) {
        // 컴포넌트로 등록 후 상단 component scan을 사용하면 가능하다.
        try(var context= new AnnotationConfigApplicationContext(
                GamingAppLauncher.class
        )){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }

}
