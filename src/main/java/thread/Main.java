package thread;

public class Main {
    public static void main(String[] args) throws Exception {
        CancelableThread cancelableThread = new CancelableThread();
        new Thread(cancelableThread).start();
        try {
            Thread.sleep(1);
        } finally {
            //设置标志位为true,中断线程
        cancelableThread.cancel();
        }
    }
}
