package concurrency.semaphore.LessonEight;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        try{
            // 指定时间内获取一个许可
//            if(semaphore.tryAcquire(3, TimeUnit.SECONDS)){
            // 指定时间内获取X个许可
                if(semaphore.tryAcquire(3,3, TimeUnit.SECONDS)){
                System.out.println("ThreadName={}");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
