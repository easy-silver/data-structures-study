package week02;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private final int capacity;
    private final List<Integer> store = new ArrayList<>();

    private Queue(int capacity) {
        this.capacity = capacity;
    }

    public static Queue createWithCapacityOf(int capacity) {
        return new Queue(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return store.size();
    }

    public boolean isEmpty() {
        return store.isEmpty();
    }

    public boolean isFull() {
        return store.size() == capacity;
    }

    public void enqueue(int item) {
        if (store.size() == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        store.add(item);
    }

    public int dequeue() {
        if (store.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return store.remove(0);
    }
}
