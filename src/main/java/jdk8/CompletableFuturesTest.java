package jdk8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesTest {

    public void run(){
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            return "hello world";
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        System.out.println(future.get());
    }
}
