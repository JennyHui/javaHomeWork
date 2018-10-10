package concurrency.semaphore.LessonSIx;

public class MyThread extends Thread{
    private MyService myService;

    public MyThread(MyService myService){
        super();
        this.myService = myService;
    }
    @Override
    public void run(){
        System.out.println("ThreadName="+ this.getName() + "启动了！");
        myService.testMethod();
    }
}
