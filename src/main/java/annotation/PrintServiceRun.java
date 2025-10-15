package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintServiceRun {
    public static void main(String[] args) {
        PrintService service = new PrintService();  // 서비스에 메소드가 여러개 있다면
        Method[] declaredMethods = service.getClass().getDeclaredMethods(); // 메소드 배열로 받아옴

        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(PrintAnnotation.class)) {
                // 해당 메소드에 PrintAnnotation이라는 어노테이션이 붙어있다면 이렇게 해라
                System.out.println("===========" + method.getName() + "===========");
                PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);

                for(int i = 0; i < annotation.number(); i++) {
                    System.out.print(annotation.value());
                }
                System.out.println();
            }

            try {
                // 사용자가 구현한 메소드 구현부
                method.invoke(service);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
