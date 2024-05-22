package com.marmin.learnspringframwork.game;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run (){
        System.out.println("Running Game" + game);
        game.up();
    }
}
