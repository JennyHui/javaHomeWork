package concurrency.countdown;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertThat;

/**
 * @author jennyhui
 */
public class Worker implements Runnable{
    private List<String> outputScraper;
    private CountDownLatch countDownLatch;

    public Worker(List<String> outputScraper, CountDownLatch countDownLatch) {
        this.outputScraper = outputScraper;
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {
//        System.out.println("jennyhui");
        outputScraper.add("hui one");
        countDownLatch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        List<String> outputScraper = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);

        List<Thread> workerLists = new ArrayList<>();

        for(int i=0; i<10;i++){
            workerLists.add(new Thread(new Worker(outputScraper, countDownLatch)));
        }
        workerLists.forEach(Thread::start);
        countDownLatch.await();
        outputScraper.add("latch released");
        System.out.println(outputScraper);
    }
}
