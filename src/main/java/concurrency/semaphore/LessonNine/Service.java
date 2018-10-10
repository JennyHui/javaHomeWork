package concurrency.semaphore.LessonNine;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private Semaphore semaphore = new Semaphore(3);

//    /**
//     * 多进路 - 多处理
//     */
//    public void sayHello(){
//        try {
//            semaphore.acquire();
//            System.out.println("ThreadName=" + Thread.currentThread().getName()+"准备");
//            System.out.println("begin hello " + System.currentTimeMillis());
//
//            for(int i=0;i<5;i++){
//                System.out.println("ThreadName=" + Thread.currentThread().getName()+"打印次数="+(i+1));
//            }
//            System.out.println("end hello " + System.currentTimeMillis());
//            semaphore.release();
//            System.out.println("ThreadName=" + Thread.currentThread().getName()+"结束");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 多进路 - 单处理
     * 阻塞的
     * 打印为有序的 - 保证了同步
     */
    private ReentrantLock lock = new ReentrantLock();
    public void sayHello(){
        try {
            semaphore.acquire();
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName()+"准备");
            System.out.println("begin hello " + System.currentTimeMillis());

            for(int i=0;i<5;i++){
                System.out.println("ThreadName=" + Thread.currentThread().getName()+"打印次数="+(i+1));
            }
            System.out.println("end hello " + System.currentTimeMillis());
            lock.unlock();
            semaphore.release();
            System.out.println("ThreadName=" + Thread.currentThread().getName()+"结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
