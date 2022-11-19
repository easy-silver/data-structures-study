package week05;

public class DoublyLinkedList {
    private Node head = new Node(null);

    public void splice(Node fromNode, Node toNode, Node targetNode) {
        //cut
        Node fromNodePrev = fromNode.getPrev();
        Node toNodeNext = toNode.getNext();
        //ap.next = bn
        //bn.prev = ap
        fromNodePrev.changeNext(toNodeNext);
        toNode.changePrev(fromNodePrev);

        //paste
        Node targetNodeNext = targetNode.getNext();
        //x.next = a
        //a.prev = x
        targetNode.changeNext(fromNode);
        fromNode.changePrev(targetNode);
        //b.next = xn
        //xn.prev = b
        toNode.changeNext(targetNodeNext);
        targetNodeNext.changePrev(toNode);
    }
}

