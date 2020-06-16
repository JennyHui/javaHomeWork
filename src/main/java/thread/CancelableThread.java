package thread;

public class CancelableThread implements Runnable {
    //线程取消标志，volatile修饰，保证内存可见性
    private volatile boolean isCanceled = false;
    @Override
    public void run() {
        while (!isCanceled) {//在工作线程中轮询检测这个取消标志
            System.out.println("The current thread is doing something...");
            System.out.println(Thread.currentThread().getName() + " cancel flag is " + isCanceled);
        }
        //当取消标志被设置为true,执行以下代码，可以做一些取消工作
        System.out.println(Thread.currentThread().getName() + "The current thread Has been cancelled");
    }

    public void cancel() {
        isCanceled = true;
    }
}