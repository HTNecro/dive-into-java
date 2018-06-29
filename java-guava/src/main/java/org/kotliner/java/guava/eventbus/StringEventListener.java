package org.kotliner.java.guava.eventbus;

import com.google.common.eventbus.Subscribe;


public class StringEventListener {

    @Subscribe
    public void handle(StringEvent event) {
        System.out.println("StringEvent Listener1: " + event.getMessage());
    }

}
