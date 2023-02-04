package Ch02_LinkedLists.Q01_RemoveDups;

public class LinkedListNode {
    LinkedListNode next;
    int data;

    public LinkedListNode(int d) {
        data = d;
    }

    void append(int d) {
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}
