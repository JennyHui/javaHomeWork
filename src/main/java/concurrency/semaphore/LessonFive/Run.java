package concurrency.semaphore.LessonFive;

public class Run {


    public static void main(String[] args) {
        MyService myService = new MyService();

        MyThread firstThread = new MyThread(myService);
        firstThread.start();
        MyThread[] arrayThreads = new MyThread[4];
        for(MyThread myThread : arrayThreads){
            myThread = new MyThread(myService);
            myThread.start();
        }
    }
}
