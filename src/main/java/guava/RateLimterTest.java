package guava;

import com.google.common.util.concurrent.RateLimiter;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class RateLimterTest {

    private static RateLimiter limiter = RateLimiter.create(1);

    private static void acquire() throws InterruptedException {
        double newRate = 1;
        if (limiter.getRate() != newRate) {
            limiter.setRate(newRate);
        }
        limiter.acquire();
        System.out.println(limiter.acquire());
    }

    public static void testAcquire() throws InterruptedException {
        for(int i = 1; i < 10; i = i + 1 ) {
            acquire();
//            double waitTime = limiter.acquire(i);
            SimpleDateFormat sdf = new SimpleDateFormat("", Locale.SIMPLIFIED_CHINESE);
            sdf.applyPattern("yyyy年MM月dd日 HH时mm分ss秒");
            System.out.println("cutTime=" + sdf.format(System.currentTimeMillis()) + " acq:" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        testAcquire();
    }
}
