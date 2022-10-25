package ch02;

import java.util.List;

public class Queue {

    private final int capacity;
    private List<Integer> store;

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
        store.add(item);
    }

    public int size() {
        return 0;
    }
}
