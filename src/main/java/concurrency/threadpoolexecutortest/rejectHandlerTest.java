package concurrency.threadpoolexecutortest;

import java.util.concurrent.*;

public class rejectHandlerTest {

    public static void main(String[] args) {
        int corePoolSize = 1;

        int maxPoolSize = 2;

        long keepAliveTime = 0;
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable> (2);

        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.SECONDS, queue, handler);

        for(int i=0; i<100; i++){
            executor.execute(new Worker());
//            System.out.println("主线程"+i+"running");
        }
        executor.shutdown();
    }
}
