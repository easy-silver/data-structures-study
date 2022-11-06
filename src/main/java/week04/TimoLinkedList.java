package week04;

public class TimoLinkedList {

    private Node head;
    private int size;

    public void pushFront(Node node) {
        if (isEmpty()) {
            changeHead(node);
        } else {
            node.changeNext(head);
            changeHead(node);
        }
        increaseSize();
    }

    private boolean isEmpty() {
        return head == null;
    }

    private void increaseSize() {
        this.size++;
    }

    private void changeHead(Node node) {
        this.head = node;
    }

    public int size() {
        return this.size;
    }

    public Node popFront() {
        if (isEmpty()) {
            throw new IllegalStateException("비어있는 리스트입니다.");
        }

        Node target = head;

        if (head.hasNextNode()) {
            Node nextNode = head.getNextNode();
            changeHead(nextNode);
        } else {
            changeHead(null);
        }

        decreaseSize();
        return target;
    }

    private void decreaseSize() {
        this.size--;
    }

    public void pushBack(Node node) {
        if (isEmpty()) {
            changeHead(node);
        } else {

            if (!head.hasNextNode()) {
                head.changeNext(node);
            } else {
                Node nextNode = head.getNextNode();
                while (nextNode.hasNextNode()) {
                    nextNode = nextNode.getNextNode();
                }
                nextNode.changeNext(node);
            }
        }

        increaseSize();
    }
}
