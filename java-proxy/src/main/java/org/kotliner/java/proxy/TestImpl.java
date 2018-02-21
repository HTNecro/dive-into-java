package org.kotliner.java.proxy;

import java.util.concurrent.TimeUnit;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
public class TestImpl implements TestInterface {
    @Override
    public void test() {
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException ignored) {
        }
        System.out.println("test");
    }
}
