package concurrency.semaphore.LessonOne;

import java.util.concurrent.Semaphore;

public class Service {

    // permits 代表同一时间内，最多允许多少个线程同时执行acquire和release之间的代码
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " begin time="+ System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end time="+ System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
