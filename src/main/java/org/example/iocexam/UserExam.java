package org.example.iocexam;

import org.example.iocexam.config.UserConfig;
import org.example.iocexam.controller.UserController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class UserExam {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        UserController controller = context.getBean(UserController.class);
        controller.joinUser();

        // 정상동작 : user의 toString() 동작
        // 하려면 -> Bean 등록
        // 1. config에 직접 @Bean 등록
        // 2. @Component, @ComponentScan, @Autowired로 의존성 주입 및 Bean 등록
        //  -- @Component를 모두 사용하는것보다 용도에 따라 @Repository, @Controller, @Service를 사용
        // 3. XML 사용 (안함)
    }
}
