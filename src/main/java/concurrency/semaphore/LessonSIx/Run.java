package concurrency.semaphore.LessonSIx;

public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread firstThread = new MyThread(service);
        firstThread.start();
        MyThread[] arrayThreads = new MyThread[4];
        for(int i=0;i<arrayThreads.length;i++){
            arrayThreads[i] = new MyThread(service);
            arrayThreads[i].start();
        }
    }
}
