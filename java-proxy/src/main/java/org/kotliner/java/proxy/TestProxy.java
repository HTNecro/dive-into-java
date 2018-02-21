package org.kotliner.java.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
public class TestProxy {

    public static void main(String[] args) {
        TestInterface testImpl = (TestInterface)Proxy.newProxyInstance(TestProxy.class.getClassLoader(),
                new Class[]{TestInterface.class},
                new DynamicInvocationHandler(new TestImpl()));
        testImpl.test();
    }

}
