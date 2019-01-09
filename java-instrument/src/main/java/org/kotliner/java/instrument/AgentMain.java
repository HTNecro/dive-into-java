package org.kotliner.java.instrument;

import java.lang.instrument.Instrumentation;

public class AgentMain {

    public static void premain(String args, Instrumentation instrument) {
        System.out.println("Hello Java Agent!");
    }

}
