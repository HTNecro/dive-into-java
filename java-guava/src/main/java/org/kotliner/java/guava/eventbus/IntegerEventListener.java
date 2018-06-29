package org.kotliner.java.guava.eventbus;

import com.google.common.eventbus.Subscribe;

public class IntegerEventListener {

    @Subscribe
    public void handle(IntegerEvent event) {
        System.out.println("IntegerEvent Listener: " + event.getValue());
    }

}
