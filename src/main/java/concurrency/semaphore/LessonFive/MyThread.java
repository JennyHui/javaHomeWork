package concurrency.semaphore.LessonFive;

public class MyThread extends Thread {

    private MyService myService = new MyService();

    public MyThread(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.testMethod();
    }
}
