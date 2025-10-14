package sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import sample.bean.Dice;
import sample.bean.Game;
import sample.bean.Player;

import java.util.List;

@PropertySource({"classpath:game.properties"})
public class GameConfig {

    // @Value("${face}")   // 이렇게 선언도 가능
    // int face;

    // Dice Bean을 등록
    @Bean
    public Dice dice(@Value("${face}") int face) {
    // public Dice dice() {
        return new Dice(face);
    }

    @Bean
    public Player kang(Dice dice) {
        // Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);
        player.setName("Kang");
        return player;
    }

    @Bean
    public Player park(Dice dice) {
        // Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);
        player.setName("park");
        return player;
    }

    @Bean
    public Player yang(Dice dice) {
        // Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);
        player.setName("yang");
        return player;
    }

    @Bean
    public Player kim(Dice dice) {
        // Player player = new Player(dice);
        Player player = new Player();
        player.setDice(dice);
        player.setName("kim");
        return player;
    }

    @Bean
    public Game game(List<Player> players)
    {
        return new Game(players);
    }
}
