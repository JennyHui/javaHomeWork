package concurrency.semaphore.LessonSeven;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        // 尝试获得一个许可
        try {
            if(semaphore.tryAcquire(3, TimeUnit.SECONDS)){
                System.out.println("ThreadName=" + Thread.currentThread().getName() + "首次进入");
                for(int i=0;i<Integer.MAX_VALUE;i++){
//                    String str = new String();
//                    Math.random();
                }
                semaphore.release();
            }else{
                System.out.println("ThreadName="+Thread.currentThread().getName() + "进入失败");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
//            System.out.println("ThreadName="+Thread.currentThread().getName() + "进入失败");
        }
    }
}
