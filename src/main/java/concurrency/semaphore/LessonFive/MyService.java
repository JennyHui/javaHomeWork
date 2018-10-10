package concurrency.semaphore.LessonFive;

import concurrency.semaphore.LessonOne.ThreadA;

import java.util.concurrent.Semaphore;

public class MyService {

    private Semaphore semaphore = new Semaphore(1);


    /**
     * drainPermits() 返回可用的许可个数，并将可用许可个数清零
     */
    public void testMethod(){
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println("还有大约" + semaphore.getQueueLength() + "个线程在等待");
            System.out.println("是否还有线程正在等待信号量呢？" + semaphore.hasQueuedThreads());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
