package org.kotliner.java.io.netty;

import io.netty.util.concurrent.DefaultThreadFactory;
import io.netty.util.concurrent.FastThreadLocal;

import java.util.concurrent.ThreadFactory;

public class FastThreadLocalTest {

    public static FastThreadLocal<String> threadLocal = new FastThreadLocal<>();
    public static FastThreadLocal<Integer> threadLocal2 = new FastThreadLocal<>();

    public static void main(String[] args) {
        ThreadFactory threadFactory = new DefaultThreadFactory("Test");
        for (int i = 0; i < 5; i++) {
            threadFactory.newThread(
                    () -> {
                        threadLocal.set("TEST");
                        threadLocal2.set(1);
                        System.out.println(threadLocal.get());
                        System.out.println(threadLocal2.get());
                    }
            ).start();
        }
    }

}
