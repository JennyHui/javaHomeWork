package concurrency.semaphore.LessonNine;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        MyThread[] myThread = new MyThread[12];
        for(int i=0;i<myThread.length;i++){
            myThread[i] = new MyThread(service);
            myThread[i].start();
        }
    }
}
