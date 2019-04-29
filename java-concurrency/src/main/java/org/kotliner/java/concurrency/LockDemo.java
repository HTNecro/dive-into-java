package org.kotliner.java.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        lock.lock();
        try {
            doSomeThing();
        } finally {
            lock.unlock();
        }
    }

    private static void doSomeThing() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ignored) {
        }
    }
}
