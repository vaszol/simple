package ru.vaszol.lesson_12;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by vas on 02.10.2015.
 */
public class Counter {
    private AtomicInteger amount = new AtomicInteger(0);

    public int increase() {
        return amount.incrementAndGet();
    }
}
