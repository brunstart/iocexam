package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.bean.Dice;
import sample.bean.Game;
import sample.bean.Player;
import sample.config.GameConfig;
import sample.config.MyBeanConfig;

public class SpringExam02 {
    public static void main(String[] args) {

        // 공장은 어떤게 중요한지 : 어떤 빈은 만들건지
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        // Dice dice = context.getBean("dice", Dice.class);
        // dice.setFace(20);
        // System.out.println(dice.getNumber());

        // Player kang = context.getBean("kang", Player.class);
        // kang.play();

        Game game = context.getBean(Game.class);
        game.play();
    }
}
