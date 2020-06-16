package concurrency.threadpoolexecutortest;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("线程:"+Thread.currentThread().getName() +"run");
    }
}
