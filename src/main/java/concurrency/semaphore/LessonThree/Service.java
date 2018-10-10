package concurrency.semaphore.LessonThree;

import java.util.concurrent.Semaphore;

public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
//        try {
//            semaphore.acquire();
//            System.out.println(Thread.currentThread().getName() + " begin time="+ System.currentTimeMillis());
//            for(int i=0;i<Integer.MAX_VALUE/50;i++){
//                String newString = new String();
//                Math.random();
//            }
//            System.out.println(Thread.currentThread().getName() + " end time="+ System.currentTimeMillis());
//            semaphore.release();
//        } catch (InterruptedException e) {
//            System.out.println("线程" + Thread.currentThread().getName() + "进入catch");
//            e.printStackTrace();
//        }

        // 等待进入acquire方法的线程，不允许被中断
        semaphore.acquireUninterruptibly();
        System.out.println(Thread.currentThread().getName() + " begin time="+ System.currentTimeMillis());
        for(int i=0;i<Integer.MAX_VALUE/50;i++){
            String newString = new String();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName() + " end time="+ System.currentTimeMillis());
        semaphore.release();


    }
}
