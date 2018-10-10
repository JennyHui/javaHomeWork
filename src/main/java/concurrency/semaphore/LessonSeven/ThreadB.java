package concurrency.semaphore.LessonSeven;


public class ThreadB extends Thread {
    private ServiceTwo service;

    public ThreadB(ServiceTwo service){
        super();
        this.service=service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
