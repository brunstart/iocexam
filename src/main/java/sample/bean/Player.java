package sample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {
    private String name;
    // @Autowired
    private Dice dice;  // 실행될 때 주사위를 주입받을 것 (의존성 주입 : DI)

    // DI 컨테이너를 통해 주입 받는 방법
    // 1. 생성자를 통해 주입
    // 2. 설정자(setter 메소드)를 통해서 주입
    // 3. 필드에 직접 주입 -- 권장하지 않음, 어노테이션을 이용 == 나중에 살펴볼 예정

    // 생성자를 통해서 주입을 받을 경우
    public Player() {
        System.out.println("player() 생성");
    }

    // @Autowired
    // public Player(Dice dice) {
    //     this.dice = dice;
    // }

    // 설정자를 통해 주입할 경우
    @Autowired
    public void setDice(Dice dice) {
        this.dice = dice;
        System.out.println("player(dice) 생성자 생성");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + "님은 주사위를 던져서 " + dice.getNumber() + " 가 나왔습니다.");
    }
}
