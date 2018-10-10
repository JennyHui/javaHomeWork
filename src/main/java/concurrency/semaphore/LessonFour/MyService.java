package concurrency.semaphore.LessonFour;

import java.util.concurrent.Semaphore;

public class MyService {

    private Semaphore semaphore = new Semaphore(10);


    /**
     * drainPermits() 返回可用的许可个数，并将可用许可个数清零
     */
    public void testMethod(){
        try {
            semaphore.acquire(1);
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " +semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " +semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " +semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
