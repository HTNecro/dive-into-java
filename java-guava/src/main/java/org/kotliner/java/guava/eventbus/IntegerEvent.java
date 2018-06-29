package org.kotliner.java.guava.eventbus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IntegerEvent {

    private int value;

    public IntegerEvent(int value) {
        this.value = value;
    }
}
