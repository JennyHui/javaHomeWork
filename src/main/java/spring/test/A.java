package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A{
    public A(){
        System.out.println("init A");
    }

    public void methodA() {
        System.out.println("方法 A 执行");

    }
    @Autowired
    private B instanceB;
 
}