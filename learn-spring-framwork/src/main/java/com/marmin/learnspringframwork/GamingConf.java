package com.marmin.learnspringframwork;

import com.marmin.learnspringframwork.game.GameRunner;
import com.marmin.learnspringframwork.game.GamingConsole;
import com.marmin.learnspringframwork.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConf {
    @Bean
    public GamingConsole game(){
        var game = new PacManGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
