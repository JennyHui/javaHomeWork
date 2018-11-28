package Spring.JavaConfigDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHelloo("hello~jenny~"));
        FunctionService functionService = context.getBean(FunctionService.class);
        System.out.println(functionService.sayHello("hello~andy~"));
    }
}
