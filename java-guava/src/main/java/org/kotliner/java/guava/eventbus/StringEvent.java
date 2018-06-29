package org.kotliner.java.guava.eventbus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StringEvent {

    private String message;

    public StringEvent(String message) {
        this.message = message;
    }

}
