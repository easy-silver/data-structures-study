package ch02;

public class Queue {

    private final int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
    }

    public static Queue create(int capacity) {
        return new Queue(capacity);
    }

    public int getCapacity() {
        return capacity;
    }
}
