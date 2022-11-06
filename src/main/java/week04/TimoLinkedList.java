package week04;

public class TimoLinkedList {

    private Node head;
    private int size;

    public void pushFirst(Node node) {
        //FIXME. isEmpty()로 변경하기
        if (head == null) {
            changeHead(node);
        } else {
            node.changeNext(head);
            changeHead(node);
        }
        increaseSize();
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
}
