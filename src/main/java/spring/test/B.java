package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B{
    public B(){
        System.out.println("init B");
    }
 
    @Autowired
    private A instanceA;
}
 