package spring.demo;

public class ApiTwo implements Api {
    @Override
    public String test(int num) {
        System.out.println("ApiTwo test method, num = " + num);
        return num +"hahaha";
    }
}
