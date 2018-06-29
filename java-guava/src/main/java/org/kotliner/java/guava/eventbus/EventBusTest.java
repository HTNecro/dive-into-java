package org.kotliner.java.guava.eventbus;

import com.google.common.eventbus.EventBus;

public class EventBusTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new StringEventListener());
        eventBus.register(new StringEventListener2());
        eventBus.register(new IntegerEventListener());

        eventBus.post(new StringEvent("String event"));
        eventBus.post(new IntegerEvent(0));
        eventBus.post(new StringEvent("String event2"));
        eventBus.post(new IntegerEvent(100));
    }

}
