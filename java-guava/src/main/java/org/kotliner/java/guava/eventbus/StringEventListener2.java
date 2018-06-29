package org.kotliner.java.guava.eventbus;

import com.google.common.eventbus.Subscribe;

public class StringEventListener2 {

    @Subscribe
    public void handle(StringEvent event) {
        System.out.println("StringEvent Listener2: " + event.getMessage());
    }

}
