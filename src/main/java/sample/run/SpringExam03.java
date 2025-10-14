package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.bean.Book;
import sample.bean.MyBean;
import sample.bean.Player;
import sample.config.MyBeanConfig;

public class SpringExam03 {
    public static void main(String[] args) {
        System.out.println("공장세우기전");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);
        System.out.println("공장 세운 후");

        MyBean bean = context.getBean(MyBean.class);
        bean.setName("yang");
        System.out.println(bean.getName());

        // Player play()를 하려면 Dice를 주입받아야한다 - dice.getNumber()를 사용하기 때문에
        // @Component만 가지고는 Player에 Dice를 주입할 수 없다.
        // @Autowired를 사용해서 Player에 Dice를 주입
        // 1. 생성자
        // 2. 설정자(setter 메소드)
        // 3. 필드에 직접 주입 -- 권장하지 않음 : 스프링에 대한 의존도가 높아짐

        Player player = context.getBean(Player.class);
        player.setName("kang");
        player.play();
    }
}