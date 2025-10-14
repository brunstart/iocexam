package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import sample.bean.Book;
import sample.bean.MyBean;

// 컴포넌트를 읽어서 Bean을 생성하겠다. 반드시 베이스 패키지 지정이 필요
@ComponentScan(basePackages = "sample") // sample 패키지 안에 있는것만 읽겠다.
public class MyBeanConfig {
    // 스프링 공장에게 어떤 빈을 관리할거진 알려줌.
    // xml
    // <bean id="mybean" class="sample.bean.MyBean"/>

    // Bean을 직접 생성
    // 기본 설정은 싱글톤으로 생성된다. 한 아이디로 객체를 생성하면 여러개 해도 메모리에는 하나만 올라감.
    // @Scope("prototype") 추가하면 getBean마다 새로 생성됨
    // @Bean
    // // @Scope("prototype")
    // public MyBean mybean() {
    //     return new MyBean();
    // }
    //
    // @Bean
    // public MyBean mybean2() {
    //     return new MyBean();
    // }
    //
    // @Bean
    // public MyBean mybean3() {
    //     MyBean mybean = new MyBean();
    //     mybean.setName("kang kyung mi");
    //     mybean.setCount(10);
    //     return mybean;
    // }
    //
    // @Bean
    // public Book book() {
    //     return new Book("무제", "작자 미상", "0000");
    // }
}
