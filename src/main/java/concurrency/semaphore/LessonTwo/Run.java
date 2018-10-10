package concurrency.semaphore.LessonTwo;

import java.util.concurrent.Semaphore;

public class Run {

//    public static void main(String[] args) {
//        Service service = new Service();
//
//        ThreadA[] a = new ThreadA[10];
//        for(int i=0;i<10;i++){
//            a[i] = new ThreadA(service);
//            a[i].start();
//        }
//    }

    //  动态添加permit 通过semaphore.release
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        try {
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            System.out.println(semaphore.availablePermits());
            semaphore.release(4);
            System.out.println(semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
