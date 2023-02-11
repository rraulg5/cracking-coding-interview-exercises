package Ch02_LinkedLists.Q05_SumLists;

import Ch02_LinkedLists.LinkedListNode;

public class SolutionB {

    /* Book solution */
    static LinkedListNode sumLists(LinkedListNode a, LinkedListNode b, int carry) {
        if (a == null && b == null && carry == 0) {
            return null;
        }

        LinkedListNode result = new LinkedListNode();
        int value = carry;
        if (a != null) {
            value += a.data;
        }
        if (b != null) {
            value += b.data;
        }

        result.data = value % 10; /* Second digit of number */

        /* Recurse */
        if (a != null || b != null) {
            LinkedListNode more = sumLists(a == null ? null : a.next, b == null ? null : b.next, value >= 10 ? 1 : 0);
            result.next = more;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedListNode listA = new LinkedListNode(9);
        listA.append(7);
        listA.append(8);

        LinkedListNode listB = new LinkedListNode(6);
        listB.append(8);
        listB.append(5);

        LinkedListNode result = sumLists(listA, listB, 0);
        while (result != null) {
            System.out.print(result.data + " -> ");
            result = result.next;
        }
    }
}
