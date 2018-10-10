package concurrency.semaphore.LessonSIx;

import java.util.concurrent.Semaphore;

public class MyService {

    /**
     * 当isFair=false表示非公平信号量,当isFair=true表示公平信号量
     *
     * 非公平运行的效果是： 线程西安启动的顺序与调用semaphore.acquire()的顺序无关，也就是线程先启动并不不代表先获得许可
     * 公平运行的效果是。。。。。跟上面相反 （有序打印）
     */
    private  boolean isFair = true;
    private Semaphore semaphore = new Semaphore(1, isFair);

    public void testMethod(){
        try {
            semaphore.acquire();
            System.out.println("testMethod ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }

    }

}
