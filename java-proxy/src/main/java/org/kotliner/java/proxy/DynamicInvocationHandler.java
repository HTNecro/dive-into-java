package org.kotliner.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
public class DynamicInvocationHandler implements InvocationHandler{

    private Object target;

    public DynamicInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("Invoke time: " + (end - start));
        return null;
    }
}
