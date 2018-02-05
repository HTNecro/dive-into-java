package org.kotliner.java.bytecode.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
public class ByteBuddyDemo {

    public void makeClass() throws Exception {
        Class<?> clazz = new ByteBuddy()
                .subclass(Test.class)
                .method(ElementMatchers.named("hello"))
                .intercept(FixedValue.value("Hello World"))
                .make()
                .load(getClass().getClassLoader())
                .getLoaded();
        Test t = (Test) clazz.newInstance();
        System.out.println(t.hello());
    }

    public static void main(String[] args) throws Exception {
        new ByteBuddyDemo().makeClass();
    }
}

class Test {
    public String hello() {
        return "print test";
    }
}