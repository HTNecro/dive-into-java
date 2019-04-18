package org.kotliner.java.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = new CompletableFutureDemo().getResultAsync();
        System.out.println(future.join());
    }

    public CompletableFuture<Integer> getResultAsync() {
        return CompletableFuture.supplyAsync(this::getResult);
    }

    public Integer getResult() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
