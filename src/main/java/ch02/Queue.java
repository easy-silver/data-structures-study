package ch02;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private final int capacity;
    private final List<Integer> store = new ArrayList();

    public Queue(int capacity) {
        this.capacity = capacity;
    }

    public static Queue create(int capacity) {
        return new Queue(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void enqueue(int item) {
        if (store.size() == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        store.add(item);
    }

    public int size() {
        return store.size();
    }

    public int dequeue() {
        return store.remove(0);
    }
}
