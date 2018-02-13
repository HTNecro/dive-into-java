package org.kotliner.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
public class DynamicInvocationHandler implements InvocationHandler{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return 42;
    }
}
