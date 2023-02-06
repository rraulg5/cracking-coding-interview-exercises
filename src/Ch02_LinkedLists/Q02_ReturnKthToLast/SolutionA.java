package Ch02_LinkedLists.Q02_ReturnKthToLast;

import Ch02_LinkedLists.LinkedListNode;

public class SolutionA {

    // if I don't have the siz. O(N) time
    public static int calculateSize(LinkedListNode list) {
        int size = 0;
        LinkedListNode node = list;

        while (node != null) {
            size++;
            node = node.next;
        }

        return size;
    }

    public static int findKthLast(LinkedListNode list, int k) {
        if (k >= list.getSize() || k < 0) {
            throw new IndexOutOfBoundsException(
                    "Index " + k + " is out of bounds for the list of size " + list.getSize()
                            + ". Index is zero-based.");
        }

        int counter = 0;
        // int size = calculateSize(list); // if I don't have the size
        LinkedListNode node = list;
        while (node != null) {
            if (counter == list.getSize() - k - 1) {
                return node.data;
            }
            counter++;
            node = node.next;
        }

        return -1;
    }

    public static int findXth(LinkedListNode list, int x) {
        if (x >= list.getSize() || x < 0) {
            throw new IndexOutOfBoundsException(
                    "Index " + x + " is out of bounds for the list of size " + list.getSize()
                            + ". Index is zero-based.");
        }
        return findKthLast(list, Math.abs(x - (list.getSize() - 1)));
    }

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);

        System.out.println(findKthLast(list, 1));
        System.out.println(findXth(list, 0));
    }
}
