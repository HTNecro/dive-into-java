package org.kotliner.java.reactor;

import reactor.core.publisher.Flux;

public class ReactorDemo {

    public static void main(String[] args) {
        Flux<Integer> range = Flux.range(1, 4)
                .map(x -> {
                    if (x <= 4) {
                        return x;
                    }
                    throw new IllegalArgumentException();
                });
        range.subscribe(System.out::println, System.out::println,
                () -> System.out.println("DONE"),
                sub -> sub.request(3));
    }
}
