package Ch02_LinkedLists;

public class LinkedListNode {
    public LinkedListNode next;
    public int data;
    private int size = 0;

    public LinkedListNode(int d) {
        data = d;
        size++;
    }

    public void append(int d) {
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
        size++;
    }

    public int getSize() {
        return size;
    }
}
