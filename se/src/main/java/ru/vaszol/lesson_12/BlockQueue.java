package ru.vaszol.lesson_12;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vas on 02.10.2015.
 */
public class BlockQueue<T> {
    public final LinkedList<T> queue = new LinkedList<T>();

    public void push(final T t) {
        synchronized (this.queue) {
            this.queue.add(t);
            this.queue.notifyAll();
        }
    }

    public T poll() {
        synchronized (this.queue) {
            while (this.queue.isEmpty()) {
                try {
                    this.queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.queue.remove();
        }
    }
}
