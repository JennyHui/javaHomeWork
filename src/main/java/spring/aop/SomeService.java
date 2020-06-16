package spring.aop;

import org.springframework.stereotype.Service;

/**
 * @author jennyhui
 */
@Service
public class SomeService {

    public void methodOne() {
        System.out.println("call method one ing");
        methodTwo();
    }

    @MaskMethod
    public void methodTwo() {
        System.out.println("call method two ing");

    }
}