package concurrency.semaphore.LessonSeven;

public class Run {

    public static void main(String[] args) {
//        Service service = new Service();
        ServiceTwo service2 = new ServiceTwo();
//        ThreadA a = new ThreadA(service);
//        a.setName("A");
//        a.start();
//        ThreadB b = new ThreadB(service);
//        b.setName("B");
//        b.start();

        ThreadA aa = new ThreadA(service2);
        aa.setName("A");
        aa.start();
        ThreadB bb = new ThreadB(service2);
        bb.setName("B");
        bb.start();
    }
}
