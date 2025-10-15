package sample.bean;

import org.springframework.stereotype.Component;

import java.util.List;

// @Component
public class Game {
    private List<Player> players;

    public Game() {}
    public Game(List<Player> playerList) {
        this.players = playerList;
    }

    public void play() {
        for(Player player : players) {
            player.play();
        }
    }
}
