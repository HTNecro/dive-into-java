package org.kotliner.java.bytecode.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
public class JavassistDemo {

    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get("org.kotliner.java.bytecode.javassist.Test");
        CtMethod method = cc.getDeclaredMethod("print");
        method.insertBefore("System.out.print(\"Test.print(): \");");
        Class<?> clazz = cc.toClass();
        Test t = (Test) clazz.newInstance();
        t.print();
    }

}

class Test {
    public void print() {
        System.out.println("print test");
    }
}
