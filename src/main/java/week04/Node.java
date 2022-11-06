package week04;

public class Node {

    private final int key;

    private Node next;

    public Node(int key) {
        this.key = key;
    }

    public void changeNext(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return next;
    }

    public boolean hasNextNode() {
        return next != null;
    }
}
