package concurrency.semaphore.LessonTwo;

import java.util.concurrent.Semaphore;

/**
 * permits=10，acquire=2
 * 代码中一共有10个许可，每次执行semaphore.acquire(2),代码消耗掉2个，所以10、2=5，说明同一时间只有5个线程允许执行acquire和reelease之间的代码
 * acquire(2) 可实现阻塞作用
 */
public class Service {

    private Semaphore semaphore = new Semaphore(10);


    public void testMethod(){
        try {
            semaphore.acquire(2);
            System.out.println(Thread.currentThread().getName() + " begin time="+ System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end time="+ System.currentTimeMillis());
            semaphore.release(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
