package concurrency.semaphore.LessonSeven;


public class ThreadA extends Thread {

    private ServiceTwo service;

    public ThreadA(ServiceTwo service){
        super();
        this.service=service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
