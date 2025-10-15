package annotation;

import java.lang.reflect.Method;

// 프레임워크가 구현해놨을 것
public class HelloRun {
    public static void main(String[] args) throws NoSuchMethodException {
        Hello hello = new Hello();

        Method method = hello.getClass().getDeclaredMethod("print");

        if (method.isAnnotationPresent(Count100.class)) {   // Count100 어노테이션이 있는지 물어볼 수 있음
            for(int i = 0; i < 100; i++){
                hello.print();
            }
        }

        hello.print();
    }
}
