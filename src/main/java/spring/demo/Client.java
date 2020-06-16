package spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
//        Api api = (ApiOne)context.getBean("api");
//        String result = api.test(123);
//        System.out.println("result = " + result);
//    }

    public static void main(String[] args) {
        String numbers = "1,2,3,4,1";

        String a = Arrays.stream(
                numbers.split(",")).distinct().collect(Collectors.joining( "," ));
        System.out.println(a);

    }
}
